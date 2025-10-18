// Approach: Variable-size Sliding Window
// 1. Maintain a sliding window using two pointers `start` and `end` and keep track of its sum (`windowSum`).
// 2. For each element added (expand window by moving `end`), check if the condition
//    `windowSum * windowSize < k` is satisfied.
// 3. If the condition breaks (i.e., product ≥ k), shrink the window from the left (increment `start`)
//    until the condition becomes valid again.
// 4. For every valid window, all subarrays ending at `end` and starting anywhere from `start` to `end`
//    are valid. Thus, add `(end - start + 1)` to the total count.
// 5. Continue this process for all elements and return the total count of valid subarrays.
//
// Time complexity: O(n) – each element is added and removed at most once
// Space complexity: O(1) – only a few variables are used

class Solution {
    public long countSubarrays(int[] nums, long k) {
        long windowSum = 0, count = 0;

        // Iterate through the array using a sliding window
        for (int start = 0, end = 0; end < nums.length; end++) {
            // Add current element to the window sum
            windowSum += nums[end];

            // Shrink the window from the left while condition breaks
            while (windowSum * (end - start + 1) >= k) {
                windowSum -= nums[start++];
            }

            // All subarrays ending at 'end' and starting between 'start' and 'end' are valid
            count += end - start + 1;
        }

        // Return total count of valid subarrays
        return count;
    }
}
