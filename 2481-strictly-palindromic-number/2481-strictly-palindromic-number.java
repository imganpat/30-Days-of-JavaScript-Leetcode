class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i < n - 1; i++) {
            String s = convert(n, i);
            for (int st = 0, e = s.length() - 1; st < e; st++, e--) {
                if (s.charAt(st) != s.charAt(e)) {
                    return false;
                }
            }
        }
        return true;
    }

    public String convert(int n, int base) {
        StringBuilder res = new StringBuilder();
        int t = n;
        while (t > 0) {
            res.append(t % base);
            t /= base;
        }
        return res.reverse().toString();
    }

}