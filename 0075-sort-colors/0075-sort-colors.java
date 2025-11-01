// Approach: Dutch National Flag Algorithm (Three-Pointer Approach)
// 1. The problem is to sort an array containing only 0s, 1s, and 2s without using extra space.
// 2. Use three pointers: 
//    - 'left' tracks the position where the next 0 should go.
//    - 'mid' is the current index being processed.
//    - 'right' tracks the position where the next 2 should go.
// 3. Traverse the array while mid <= right:
//    - If nums[mid] == 0 → swap nums[left] and nums[mid], increment both left and mid.
//    - If nums[mid] == 1 → just move mid forward.
//    - If nums[mid] == 2 → swap nums[mid] and nums[right], decrement right (do not move mid since swapped value is unprocessed).
// 4. Continue until mid passes right. The array will be sorted as all 0s → 1s → 2s.
//
// Time complexity: O(n) – each element is visited at most once
// Space complexity: O(1) – in-place sorting, no extra space used

class Solution {
    public void sortColors(int[] nums) {
        int left = 0, mid = 0, right = nums.length - 1;

        // Traverse the array until mid crosses right
        while (mid <= right) {
            if (nums[mid] == 0) {
                // Swap 0 to the front
                swap(nums, left, mid);
                left++;
                mid++;
            } 
            else if (nums[mid] == 1) {
                // Leave 1s in the middle
                mid++;
            } 
            else {
                // Swap 2 to the end
                swap(nums, mid, right);
                right--;
            }
        }
    }

    public void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
