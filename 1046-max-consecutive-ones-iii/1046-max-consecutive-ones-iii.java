// Approach: Variable-size Sliding Window
// 1. Use two pointers `start` and `end` to maintain a window that can contain at most `k` zeros.
// 2. Expand the window by moving `end` and count zeros (`zeroCount`) as you go.
// 3. If the number of zeros exceeds `k`, shrink the window from the left (`start++`) until
//    the number of zeros is at most `k` again.
// 4. After each expansion, calculate the current window size and update `maxLen` with the maximum length found.
// 5. Continue until the end of the array is reached, and return `maxLen`.
//
// Time complexity: O(n) – each element is visited at most twice (once by `end`, once by `start`)
// Space complexity: O(1) – only a few variables are used

class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0, zeroCount = 0;

        // Expand the window using 'end'
        for (int start = 0, end = 0; end < nums.length; end++) {

            // Count zeros in the current window
            if (nums[end] == 0) {
                zeroCount++;
            }

            // Shrink the window from the left if zeroCount exceeds k
            if (zeroCount > k) {
                if (nums[start] == 0) {
                    zeroCount--;
                }
                start++;
            }

            // Update maximum length of valid window
            maxLen = Math.max(maxLen, end - start + 1);
        }

        // Return the maximum length of subarray with at most k zeros
        return maxLen;
    }
}
