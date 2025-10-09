// Approach: Sorting + Sliding Window
// 1. If k == 1, difference is 0 because only one element is selected.
// 2. Sort the array so that elements are in increasing order.
// 3. Use a sliding window of size 'k' to check each possible group of k elements.
//    - The minimum difference will be the smallest value of (nums[end] - nums[start])
//      among all windows of size k.
// 4. Return the minimum difference found.

// Time complexity: O(n log n) – due to sorting
// Space complexity: O(1) – only a few variables used, sorting done in-place

class Solution {
    public int minimumDifference(int[] nums, int k) {
        // If only one element is selected, difference is 0
        if (k == 1) {
            return 0;
        }

        // Variable to store the minimum difference found
        int minDifference = Integer.MAX_VALUE;

        // Step 1: Sort the array to make differences easy to calculate
        Arrays.sort(nums);

        // Step 2: Use a sliding window of size k
        for (int start = 0, end = k - 1; end < nums.length; start++, end++) {
            // Difference between max (nums[end]) and min (nums[start]) in the window
            int currentDiff = nums[end] - nums[start];

            // Update minimum difference if a smaller one is found
            minDifference = Math.min(minDifference, currentDiff);
        }

        // Step 3: Return the smallest difference found
        return minDifference;
    }
}
