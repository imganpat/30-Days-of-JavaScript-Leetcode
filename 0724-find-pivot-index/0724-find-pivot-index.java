class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n], rightSum = new int[n];

        leftSum[0] = nums[0];
        rightSum[n - 1] = nums[n - 1];

        for (int i = 1, j = n - 2; i < n; i++, j--) {
            leftSum[i] = leftSum[i - 1] + nums[i];
            rightSum[j] = rightSum[j + 1] + nums[j];
        }

        for (int i = 0; i < n; i++) {
            if (leftSum[i] == rightSum[i]) {
                return i;
            }
        }

        return -1;
    }
}