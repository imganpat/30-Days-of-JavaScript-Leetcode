// Approach: Better Approach 
// Frequency Counting with Hashing (Optimal O(n))
// Time Complexity: O(n)
// Space Complexity: O(26) .i.e O(1)

class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        int vowelMax = 0, consonantMax = 0;
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < 26; i++){
            char c = (char) (i + 'a');
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
                if(vowelMax < freq[i]) {
                    vowelMax = freq[i];
                }
            } else {
                if(consonantMax < freq[i]) {
                    consonantMax = freq[i];
                }
            }
        }

        return vowelMax + consonantMax;
    }
}