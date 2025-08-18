class Solution {
    public int[] plusOne(int[] digits) {
        int digitsLength = digits.length;
        for(int i = digitsLength - 1; i >= 0; i--){
            if(digits[i] >= 9)
                digits[i] = 0;
            else{
                digits[i] = digits[i] + 1;
                break;
            } 
        }
        if(digits[0] == 0){
            int [] arr = new int[digitsLength + 1];
            for(int i = digitsLength - 1; i >= 0; i--)
                arr[i] = digits[i];
            arr[0] = 1;
            return arr;
        }
        return digits;
    }
}