class Solution {
    public int alternateDigitSum(int n) {
        int sum1 = 0, sum2 = 0, i = 0;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            if(i++ % 2 == 0) {
                sum1 += digit;
            }
            else {
                sum2 += digit;
            }
        }
        return (i % 2 == 0) ? sum2 - sum1 : sum1-sum2;
    }
}