class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j <= i; j++){
                sum+=nums[j];
                res[i] = sum;
            }
        }
        return res;
    }
}