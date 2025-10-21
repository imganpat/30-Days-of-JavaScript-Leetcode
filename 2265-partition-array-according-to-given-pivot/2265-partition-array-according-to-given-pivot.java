// Approach: Two-Pointer Partitioning
// 1. Use two pointers to fill a new array (`arr`) from both ends.
// 2. Left pointer (`i`) scans forward, adding elements less than the pivot at the front (`i2`).
// 3. Right pointer (`j`) scans backward, adding elements greater than the pivot at the end (`j2`).
// 4. After processing, fill the remaining middle section of the array with the pivot value.
// 5. This partitions the array into three sections: < pivot, == pivot, > pivot.
//
// Time complexity: O(n) – each element is visited a constant number of times
// Space complexity: O(n) – new array of size n is created for output

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int length = nums.length, i = 0, i2 = 0, j = length - 1, j2 = length - 1;
        int[] arr = new int[length];

        // Step 1: Fill elements smaller and larger than pivot
        while (i < length) {
            if (nums[i] < pivot) {
                arr[i2++] = nums[i]; // Add smaller elements at the front
            }
            if (nums[j] > pivot) {
                arr[j2--] = nums[j]; // Add larger elements at the end
            }
            i++;
            j--;
        }

        // Step 2: Fill middle section with pivot values
        while (i2 <= j2) {
            arr[i2++] = pivot;
        }

        // Step 3: Return the rearranged array
        return arr;
    }
}
