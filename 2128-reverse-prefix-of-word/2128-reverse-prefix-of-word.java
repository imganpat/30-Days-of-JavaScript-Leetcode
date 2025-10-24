class Solution {
    public String reversePrefix(String word, char ch) {
        int k = word.indexOf(ch);
        if (k == -1) return word;

        char[] chars = word.toCharArray();
        int i = 0, j = k;

        while (i < j) {
            char temp = chars[i];
            chars[i++] = chars[j];
            chars[j--] = temp;
        }

        return new String(chars);
    }
}
