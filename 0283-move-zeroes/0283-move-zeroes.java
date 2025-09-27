// Approach: Two-pointer method
// 1. Use pointer i to track zeros and pointer j to find the next non-zero.
// 2. When nums[i] is zero and nums[j] is non-zero, swap them (actually shift the non-zero forward).
// 3. Continue until j reaches the end.
 
// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, j = i + 1;
        while (j < nums.length) {
            if (nums[i] == 0 && nums[j] == 0) {
                j++;
            } else if (nums[i] == 0) {
                nums[i++] = nums[j];
                nums[j++] = 0;
            } else {
                i++;
                j++;
            }
        }
    }
}