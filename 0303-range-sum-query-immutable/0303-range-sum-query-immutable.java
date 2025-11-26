class NumArray {
    private int[] prefixSum;

    public NumArray(int[] nums) {
        int n = nums.length;
        this.prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            this.prefixSum[i+1] = this.prefixSum[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return this.prefixSum[right + 1] - this.prefixSum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */