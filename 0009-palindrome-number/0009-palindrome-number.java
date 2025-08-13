class Solution {
    public boolean isPalindrome(int x) {
        int reverseNumber = 0;
        int tempNumber = x;
        while(tempNumber > 0) {
            int digit = tempNumber % 10;
            reverseNumber = reverseNumber * 10 + digit;
            tempNumber /= 10;
        }
        return x == reverseNumber;
    }
}