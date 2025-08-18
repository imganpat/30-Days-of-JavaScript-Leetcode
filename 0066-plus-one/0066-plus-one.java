class Solution {
    public int[] plusOne(int[] digits) {
        int digitsLength = digits.length;
        for(int i = digitsLength - 1; i >= 0; i--){
            if(digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int [] arr = new int[digitsLength + 1];
        // for(int i = digitsLength - 1; i >= 0; i--)
        //     arr[i] = digits[i];
        // by default the values are 0
        arr[0] = 1;
        return arr;
        
    }
}