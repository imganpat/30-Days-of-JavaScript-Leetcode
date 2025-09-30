// Approach: Sliding window
// 1. Maintain a running sum of the last k elements.
// 2. For each index i >= k-1, compute the average of the current window.
// 3. Track the maximum average seen so far.
// 4. Slide the window by subtracting the element at 'start' and incrementing 'start'.

// Time complexity: O(n) – each element is added once and removed once
// Space complexity: O(1) – only a few variables used


class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0.0, max = Double.NEGATIVE_INFINITY;
        int start = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i >= k - 1) {
                double average = sum / k;
                if (max < average) {
                    max = average;
                }
                sum -= nums[start];
                start++;
            }
        }
        return max;
    }
}