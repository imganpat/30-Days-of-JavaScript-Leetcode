class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] decryptedCode = new int[n];

        if (k == 0)
            return decryptedCode;

        if (k > 0) {
            int count = 0, sum = 0;
            for (int start = 0, end = 0; start < n; end++) {
                end %= n;
                sum += code[end];
                if (++count > k) {
                    sum -= code[start];
                    decryptedCode[start++] = sum;
                    count--;
                }
            }

        } else {
            int count = 0, sum = 0;
            k = Math.abs(k);
            for (int start = n - 1, end = n - 1; start >= 0; end--) {
                end %= n;
                if (end < 0) {
                    end = n - 1;
                }
                sum += code[end];
                if (++count > Math.abs(k)) {
                    sum -= code[start];
                    decryptedCode[start--] = sum;
                    count--;
                }
            }
        }

        return decryptedCode;
    }
}