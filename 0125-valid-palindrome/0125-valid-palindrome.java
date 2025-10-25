// Approach: Two-Pointer Technique (Ignoring Non-Alphanumeric Characters)
// 1. Use two pointers: 'left' starting from the beginning and 'right' from the end of the string.
// 2. Convert both characters to lowercase for case-insensitive comparison.
// 3. Skip characters that are not letters or digits using Character.isLetterOrDigit().
// 4. If both characters are valid but not equal, return false (not a palindrome).
// 5. Continue moving inward until both pointers cross.
// 6. If the loop completes without mismatches, the string is a palindrome.
//
// Time complexity: O(n) – Each character is checked at most once.
// Space complexity: O(1) – Constant extra space used (in-place comparison).

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            char leftChar = Character.toLowerCase(s.charAt(left)), rightChar = Character.toLowerCase(s.charAt(right));

            // Skip non-alphanumeric characters from the left side
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }

            // Skip non-alphanumeric characters from the right side
            if (!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }

            // If mismatch found, return false
            if (leftChar != rightChar) {
                return false;
            }

            // Move both pointers inward
            left++;
            right--;
        }

        // If loop completes, it's a palindrome
        return true;
    }
}
