// Approach: Sliding Window with Character Frequency
// 1. Maintain a sliding window using 'start' and 'end' pointers.
// 2. Keep an array 'freq' of size 26 to store the frequency of each character in the current window.
// 3. Track the maximum frequency (maxFreq) of any character in the window.
// 4. Expand the window by moving 'end'. If the number of characters to change 
//    (window size - maxFreq) exceeds k, shrink the window from the left (move 'start').
// 5. Update maxLen with the maximum valid window length found so far.
// 6. Return maxLen as the length of the longest substring that can be obtained by 
//    replacing at most k characters.
//
// Time complexity: O(n) – each character is added and removed at most once
// Space complexity: O(1) – frequency array of fixed size 26

class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen = 0, maxFreq = 0;
        int[] freq = new int[26];

        for(int start = 0, end = 0; end < s.length(); end++){
            // Include current character in the frequency array
            freq[s.charAt(end) - 'A'] += 1; 
            
            // Update max frequency in the current window
            maxFreq = Math.max(maxFreq, freq[s.charAt(end) - 'A']);
            
            // Shrink window if replacements needed exceed k
            while((end - start + 1) - maxFreq > k){
                freq[s.charAt(start) - 'A']--;
                start++;
            }

            // Update maximum substring length
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}
