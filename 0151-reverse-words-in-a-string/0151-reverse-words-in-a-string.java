class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split("\\s+");
        StringBuilder res = new StringBuilder();

        for (String word : arr) {
            res.append(reverse(word)).append(" ");
        }

        return res.reverse().toString().trim();
    }

    public String reverse(String word) {
        StringBuilder rev = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            rev.append(word.charAt(i));
        }

        return rev.toString();
    }
}