// Approach: Brute Force
// Time Complexity: O(n^2)
// Space Complexity: O(1)

class Solution {
    public int maxFreqSum(String s) {
        int vowelMax = 0, consonantMax = 0;
        for (int i = 0; i < s.length(); i++) {
            int vowelCount = 0, consonantCount = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                            || s.charAt(i) == 'u') {
                        vowelCount++;
                    } else {
                        consonantCount++;
                    }
                }
            }
            if (vowelMax < vowelCount) {
                vowelMax = vowelCount;
            }
            if (consonantMax < consonantCount) {
                consonantMax = consonantCount;
            }
        }
        return vowelMax + consonantMax;
    }
}