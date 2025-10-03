// Approach: Variable-size sliding window
// 1. Use two pointers (start, end) to maintain a sliding window.
// 2. Expand the window by moving 'end' and adding s[end] to the HashSet.
// 3. If a duplicate character is found, shrink the window from the left 
//    (remove s[start] from the set and move 'start' forward).
// 4. Keep track of the maximum window size as the longest substring without repeats.

// Time complexity: O(n) – each character is added and removed at most once
// Space complexity: O(k) – at most k unique characters stored in the HashSet (k ≤ n)

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int max = 0;
        for (int start = 0, end = 0; end < s.length(); end++) {
            while (window.contains(s.charAt(end))) {
                window.remove(s.charAt(start++));
            }
            window.add(s.charAt(end));
            max = Math.max(max, end - start + 1);
        }
        return max;
    }
}