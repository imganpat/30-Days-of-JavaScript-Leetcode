// Approach: Variable-size sliding window with HashSet
// 1. Use two pointers (start, end) to maintain a sliding window of size 3.
// 2. Use a HashSet to store unique characters in the current window.
// 3. Expand the window by moving 'end' and adding s[end].
// 4. If a duplicate character is found, shrink the window from the left until it's unique.
// 5. When window size reaches 3, check if all characters are unique (HashSet size == 3).
//    - If yes, increment goodSubstringCount.
// 6. Slide the window forward by removing s[start].

// Time complexity: O(n) – each character is added and removed at most once
// Space complexity: O(1) – HashSet stores at most 3 characters at a time

class Solution {
    public int countGoodSubstrings(String s) {
        int stringLength = s.length(), goodSubstringCount = 0;

        // HashSet to store unique characters in the current window
        Set<Character> freq = new HashSet<>();

        // Two pointers: 'start' = left of window, 'end' = right of window
        for (int start = 0, end = 0; end < stringLength; end++) {

            // If current character is already in window, shrink from the left
            while (freq.contains(s.charAt(end))) {
                freq.remove(s.charAt(start++));
            }

            // Add current character to the window
            freq.add(s.charAt(end));

            // When window size reaches 3
            if (end - start == 2) {
                // Check if all characters are unique
                if (freq.size() == 3) {
                    goodSubstringCount++;
                }
                // Slide the window forward
                freq.remove(s.charAt(start++));
            }
        }

        // Return the count of good substrings
        return goodSubstringCount;
    }
}
