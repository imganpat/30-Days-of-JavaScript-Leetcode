class Solution {
    public int subarraySum(int[] nums, int k) {
        // int sum = 0, count = 0;
        // for(int start = 0, end = 0; end < nums.length; end++){
        //     sum += nums[end];
        //     while(sum > k){
        //         sum -= nums[start++];
        //     }
        //     if(sum == k){
        //         count++;
        //     }
        // }
        // return count;
        int n = nums.length, count = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}