// Approach: Prefix Sum + HashMap Frequency
// 1. Use a running prefix sum (`sum`) as you iterate through the array.
// 2. Use a HashMap to store how many times each prefix sum has occurred so far.
// 3. For each index, check if (sum - k) exists in the map.
//    - If it does, it means there are map.get(sum - k) subarrays ending at this index whose sum = k.
// 4. Add the current prefix sum to the map (increase its frequency).
// 5. Initialize map with {0 → 1} to handle cases where a subarray starting from index 0 equals k.
// 6. Return total count of valid subarrays.
//
// Time complexity: O(n) – single pass with constant-time map operations
// Space complexity: O(n) – HashMap storing prefix sums

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        // Base case: prefix sum = 0 occurs once
        map.put(0, 1);
        
        for (int num : nums) {
            sum += num;

            // If (sum - k) exists, add its frequency to count
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            // Store/update frequency of current prefix sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}
