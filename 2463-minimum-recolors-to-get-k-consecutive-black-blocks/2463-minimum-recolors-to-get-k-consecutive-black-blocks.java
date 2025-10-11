// Approach: Sliding Window
// 1. Use two pointers 'start' and 'end' to maintain a window of size k.
// 2. Count the number of 'W' (white) blocks in the current window (whiteCount).
// 3. If window size exceeds k, shrink from the left and adjust whiteCount accordingly.
// 4. When window size is exactly k, update minRecolors with the minimum whiteCount seen so far.

// Time complexity: O(n) – each character is visited once
// Space complexity: O(1) – only a few variables used

class Solution {
    public int minimumRecolors(String blocks, int k) {
        int whiteCount = 0, minRecolors = Integer.MAX_VALUE;

        // Two pointers: 'start' = left of window, 'end' = right of window
        for (int start = 0, end = 0; end < blocks.length(); end++) {

            // If current block is 'W', increment whiteCount
            if (blocks.charAt(end) == 'W') {
                whiteCount++;
            }

            // If window size exceeds k, shrink window from left
            if (end - start >= k && blocks.charAt(start++) == 'W') {
                whiteCount--;
            }

            // When window size is exactly k, update minRecolors
            if (end - start + 1 == k) {
                minRecolors = Math.min(minRecolors, whiteCount);
            }
        }
        return minRecolors;
    }
}
