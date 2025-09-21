// Approach: Brute force
// Time complexity: O(i * j * k)
// Space complexity: O(1)

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            boolean isConsistent = true;
            for (int j = 0; j < words[i].length(); j++) {
                boolean flag = false;
                for (int k = 0; k < allowed.length(); k++) {
                    if (words[i].charAt(j) == allowed.charAt(k)) {
                        flag  = true;
                        break;
                    }
                }
                if(!flag){
                    isConsistent = false;
                }
            }
            if(isConsistent){
                count++;
            }
        }
        return count;
    }
}