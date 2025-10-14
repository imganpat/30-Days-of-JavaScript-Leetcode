// Approach: Sliding Window with Character Counting
// 1. Maintain a sliding window using two pointers: 'st' (start) and 'e' (end).
// 2. Keep track of the number of '0's and '1's within the current window.
// 3. Expand the window by moving 'e' forward and updating the respective count.
// 4. If both zeroCount and oneCount exceed 'k', shrink the window from the left
//    (move 'st' forward) until the condition (zeroCount ≤ k or oneCount ≤ k) is satisfied.
// 5. For each valid window, add (e - st + 1) to totalCount, which represents
//    the number of valid substrings ending at index 'e'.
// 6. Continue until the end of the string is reached.
//
// Time complexity: O(n) – each character is visited at most twice (once by 'e', once by 'st')
// Space complexity: O(1) – uses only a few integer variables

class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int zeroCount = 0, oneCount = 0, totalCount = 0;

        // Two-pointer sliding window
        for (int st = 0, e = 0; e < s.length(); e++) {
            // Expand the window and update character counts
            if (s.charAt(e) == '0') {
                zeroCount++;
            } else {
                oneCount++;
            }

            // Shrink the window when both counts exceed 'k'
            while (zeroCount > k && oneCount > k) {
                if (s.charAt(st++) == '0') {
                    zeroCount--;
                } else {
                    oneCount--;
                }
            }

            // Add the count of valid substrings ending at 'e'
            totalCount += e - st + 1;
        }

        // Return total valid substrings count
        return totalCount;
    }
}
