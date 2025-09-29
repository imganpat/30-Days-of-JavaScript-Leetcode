// Approach: Brute force
// For each index i:
//   - Compute leftSum by summing all elements before i
//   - Compute rightSum by summing all elements after i
//   - Store |leftSum - rightSum| in result

// Time complexity: O(n^2) – for each index, you scan left and right parts
// Space complexity: O(n) – result array only

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            for (int j = i + 1; j < nums.length; j++) {
                rightSum += nums[j];
            }

            result[i] = Math.abs(leftSum - rightSum);
        }

        return result;
    }
}
