// Approach: Variable Sliding Window (Two Pointers)
// 1. Maintain two pointers, 'left' and 'right', to represent the window boundaries.
// 2. Keep multiplying elements (nums[right]) to a running product as the window expands.
// 3. If product becomes ≥ k, shrink the window from the left by dividing nums[left] until product < k.
// 4. For each valid window (product < k), all subarrays ending at 'right' are valid,
//    so add (right - left + 1) to the total count.
// 5. Continue until all elements are processed.
//
// Time complexity: O(n) – each element is visited at most twice (once by 'right', once by 'left')
// Space complexity: O(1) – uses only a few integer variables

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // Edge case: if k <= 1, no subarray product can be less than k
        if (k == 0 || k == 1) {
            return 0;
        }

        int count = 0, product = 1;

        // Sliding window using two pointers
        for (int left = 0, right = 0; right < nums.length; right++) {
            // Include current element in the product
            product *= nums[right];

            // Shrink the window from the left if product ≥ k
            while (product >= k) {
                product /= nums[left++];
            }

            // All subarrays ending at 'right' and starting from 'left' are valid
            count += right - left + 1;
        }

        // Return total count of valid subarrays
        return count;
    }
}
