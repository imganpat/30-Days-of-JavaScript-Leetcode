class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder str = new StringBuilder();
        int k = word.indexOf(ch);

        if(k == -1) {
            return word;
        }
        
        for (int i = 0; i < word.length(); i++) {
            if (i <= k) {
                str.append(word.charAt(Math.abs(i - k)));
            } else {
                str.append(word.charAt(i));
            }
        }

        return str.toString();
    }
}