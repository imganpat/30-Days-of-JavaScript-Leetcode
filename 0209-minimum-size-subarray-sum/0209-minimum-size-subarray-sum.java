// Approach: Variable-size sliding window
// 1. Expand the window by moving 'end' and adding nums[end] to sum.
// 2. Once sum >= target, shrink the window from the left (move 'start') 
//    while updating the minimum length.
// 3. Return 0 if no valid subarray is found.

// Time complexity: O(n) – each element is added once and removed once
// Space complexity: O(1) – only a few variables used

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0, minLen = Integer.MAX_VALUE;

        for (int start = 0, end = 0; end < nums.length; end++) {
            sum += nums[end];
            while (sum >= target) {
                int currentLen = end - start + 1;
                minLen = Math.min(minLen, currentLen);
                sum -= nums[start++];
            }
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}