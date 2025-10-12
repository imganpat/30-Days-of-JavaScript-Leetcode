class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        for (int end = 0; end + 2 < nums.length; end++) {
            if (nums[end] != 1) {
                for (int i = end; i <= end + 2; i++) {
                    nums[i] = nums[i] == 0 ? 1 : 0;
                }
                count++;
            }
        }
        // return nums[nums.length - 1] == 0 || nums[nums.length - 2] == 0 || nums[nums.length - 3] == 0 ? -1 : count;

        for(int n: nums){
            if (n == 0) {
                return -1;
            }
        }
        return count;
    }
}