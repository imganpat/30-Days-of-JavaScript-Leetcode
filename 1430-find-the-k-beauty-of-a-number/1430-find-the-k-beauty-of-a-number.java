// Approach: Sliding Window on String representation
// 1. Convert the number 'num' to a string for easy substring extraction.
// 2. Use a sliding window of size 'k' to get all substrings of length 'k'.
// 3. Convert each substring back to an integer (subNumber).
// 4. If subNumber is not 0 and divides 'num' evenly, increment the count.
// 5. Continue until all substrings are checked.

// Time complexity: O(n * k) – where n = number of digits in 'num'
//    (substring extraction and parsing each takes O(k))
// Space complexity: O(1) – only a few variables are used

class Solution {
    public int divisorSubstrings(int num, int k) {
        // Convert number to string to easily work with substrings
        String str = num + "";
        int count = 0; // To count the number of valid substrings

        // Slide a window of size 'k' across the string
        for (int start = 0; start + k <= str.length(); start++) {

            // Extract substring of length 'k' and convert it to integer
            int subNumber = Integer.parseInt(str.substring(start, start + k));

            // Check if subNumber is not zero and divides 'num' completely
            if (subNumber != 0 && num % subNumber == 0) {
                count++; // Valid divisor substring found
            }
        }

        // Return total count of valid divisor substrings
        return count;
    }
}
