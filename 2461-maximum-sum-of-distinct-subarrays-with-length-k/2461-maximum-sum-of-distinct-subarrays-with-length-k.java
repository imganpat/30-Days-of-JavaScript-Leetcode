// Approach: Sliding Window + HashMap (Frequency Tracking)
// 1. Maintain a sliding window using two pointers: 'start' and 'end'.
// 2. Add nums[end] into the window while updating the running sum and frequency map.
// 3. If the current element's frequency becomes > 1 OR the window size becomes > k,
//    shrink the window from the left by moving 'start' forward,
//    decreasing frequencies and deducting from the running sum.
// 4. After adjusting, if the window size is exactly k and all elements are unique,
//    update max with the current window sum.
// 5. Continue this process until 'end' reaches the end of the array,
//    and return the highest valid subarray sum found.
//
// Time complexity: O(n) – each element enters and leaves the window at most once
// Space complexity: O(k) – HashMap stores at most k unique elements

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long max = 0, sum = 0;
        int start = 0, end = 0;

        while (end < nums.length) {
            // Add new element into the window
            sum += nums[end];
            map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);

            // Shrink window while constraints are violated
            while (map.get(nums[end]) > 1 || end - start + 1 > k) {
                map.put(nums[start], map.get(nums[start]) - 1);
                sum -= nums[start];

                if (map.get(nums[start]) == 0) {
                    map.remove(nums[start]);
                }
                start++;
            }

            // If window size matches k, update max
            if (end - start + 1 == k) {
                max = Math.max(max, sum);
            }

            end++;
        }

        return max;
    }
}
