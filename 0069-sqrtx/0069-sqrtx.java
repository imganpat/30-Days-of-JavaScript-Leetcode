class Solution {
    public int mySqrt(int x) {
        if(x < 2) return x;
        int left = 1;
        int right = x / 2;
        while(left <= right){
            int mid = (left + right) / 2;
            long square = (long) mid * mid;
            if(square == x)
                return (int) mid;
            if(square < x)
                left = mid + 1;
            else
                right = mid -1;
        }
        return right;
    }
}