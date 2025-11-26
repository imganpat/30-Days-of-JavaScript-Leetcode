class NumArray {
    private int[] prefixSum;

    public NumArray(int[] nums) {
        int n = nums.length;
        prefixSum = new int[n];
        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            this.prefixSum[i] = this.prefixSum[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return (left == 0)
                ? this.prefixSum[right]
                : this.prefixSum[right] - this.prefixSum[left - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */