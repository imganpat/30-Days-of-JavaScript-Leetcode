// Approach: Iterative Checking with Alternating Parity Condition
// 1. Traverse through each element in the array as a potential starting point.
// 2. Begin a subarray only if nums[start] is even and ≤ threshold.
// 3. Expand the subarray (move 'end' forward) as long as two conditions hold:
//      - The absolute difference between consecutive numbers is odd (ensures alternating even-odd pattern).
//      - nums[end] ≤ threshold (ensures numbers are within allowed limit).
// 4. Keep track of the current alternating subarray length (currentLen) and update maxLen accordingly.
// 5. Skip already checked elements by moving 'start' to 'end - 1' for efficiency.
// 6. Return the maximum alternating subarray length found.
//
// Time complexity: O(n) – each element is visited at most twice (by start and end pointers)
// Space complexity: O(1) – uses only a few variables for counting and comparisons

class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int maxLen = 0;

        // Iterate through each index as a potential starting point
        for (int start = 0; start < nums.length; start++) {

            // Valid start condition: even number ≤ threshold
            if (nums[start] <= threshold && nums[start] % 2 == 0) {
                int currentLen = 1;
                int end = start + 1;

                // Expand while alternating parity and within threshold
                while (end < nums.length &&
                       Math.abs(nums[end] - nums[end - 1]) % 2 == 1 &&
                       nums[end] <= threshold) {
                    currentLen++;
                    end++;
                }

                // Update maximum alternating length
                maxLen = Math.max(maxLen, currentLen);

                // Skip checked portion for efficiency
                start = end - 1;
            }
        }

        // Return the length of the longest alternating subarray
        return maxLen;
    }
}
