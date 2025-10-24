class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder str = new StringBuilder();

        for (int i = word.indexOf(ch); i >= 0; i--) {
            str.append(word.charAt(i));
        }

        for (int i = word.indexOf(ch) + 1; i < word.length(); i++) {
            str.append(word.charAt(i));
        }
        
        return str.toString();
    }
}