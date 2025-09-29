// Approach: Prefix–suffix method
// 1. Build a rightSum array: for each index i, store the sum of elements to its right.
// 2. Build a leftSum array: for each index i, store the sum of elements to its left.
// 3. For each index i, compute |leftSum[i] - rightSum[i]| and store in result.

// Time complexity: O(n) – two passes for left and right sums
// Space complexity: O(n) – extra arrays leftSum, rightSum, and result
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] result = new int[nums.length];

        int sum = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                sum = 0;
            } else {
                sum += nums[i + 1];
            }
            rightSum[i] = sum;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                sum = 0;
            } else {
                sum += nums[i - 1];
            }
            leftSum[i] = sum;
            result[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return result;
    }
}
