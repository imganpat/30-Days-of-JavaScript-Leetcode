class Solution {
    public int[] buildArray(int[] nums) {
        int length = nums.length;
        int [] ans = new int[length];
        for(int i = 0; i < length; i++){
            ans[i] = nums[nums[i]];
        } 
        return ans;
    }
}