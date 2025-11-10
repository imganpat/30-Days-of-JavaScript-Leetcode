// Approach: Two-Pointer Subsequence Matching
// 1. Use two pointers: 'i' for string s and 'j' for string t.
// 2. Traverse s and try to match characters of t in order.
//    - If s[i] == t[j], move pointer j (matched one character of t).
//    - Always move pointer i forward.
// 3. After the loop, j indicates how many characters of t were matched as a subsequence of s.
// 4. The remaining characters in t (t.length() - j) are the ones we must append to s.
// 5. Return the number of unmatched characters.
//
// Time complexity: O(n) – n = length of s (t is also linear in matching)
// Space complexity: O(1) – constant space used

class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0, j = 0;

        // Match t as a subsequence of s
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                j++; // matched a character from t
            }
            i++; // move in s
        }

        // Characters still needed to form t
        return t.length() - j;
    }
}