class Solution {
    public int[] buildArray(int[] nums) {
        int length = nums.length;
        int [] ans = new int[length];
        for(int i = 0; i < length; i++){
            ans[i] = nums[i] + nums[nums[i]] * length;
            ans[i] = nums[nums[i]] % length;
        }
        return ans;
    }
}