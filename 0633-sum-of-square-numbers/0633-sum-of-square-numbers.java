class Solution {
    public boolean judgeSquareSum(int c) {
        long l = 0, r = (long) Math.sqrt(c);

        while(l <= r){
            long sum = (l * l) + (r * r);
            if(sum == c){
                return true;
            }
            else if(sum > c){
                r--;
            }else{
                l++;
            }
        }
        return false;
    }
}