class Solution {
    public int pivotInteger(int n) {
        int[] prefixSum = new int[n], suffixSum = new int[n];

        for (int i = 1, j = n - 2; i < n; i++, j--) {
            prefixSum[i] = prefixSum[i - 1] + i;
            suffixSum[j] = suffixSum[j + 1] + j + 2;
        }

        for (int i = 0; i < n; i++) {
            if (prefixSum[i] == suffixSum[i]) {
                return i + 1;
            }
        }

        return -1;
    }
}