// Approach: HashMap Lookup (Single Pass)
// 1. Use a HashMap to store each number and its index as you iterate through the array.
// 2. For each element nums[i], check if (target - nums[i]) already exists in the map.
//    - If it does, we have found the two indices whose numbers sum to the target.
// 3. Otherwise, store nums[i] with its index in the map for future lookups.
// 4. Return the pair of indices once found, or an empty array if no such pair exists.
//
// Time complexity: O(n) – each element is processed and looked up once in the map
// Space complexity: O(n) – the map stores up to n elements in the worst case

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap to store number -> index
        Map<Integer, Integer> map = new HashMap<>();
        
        // Traverse through each number
        for (int i = 0; i < nums.length; i++) {
            // Check if complement (target - nums[i]) is already seen
            if (map.containsKey(target - nums[i])) {
                // Return indices of the two numbers
                return new int[] { map.get(target - nums[i]), i };
            }
            // Store the current number and its index
            map.put(nums[i], i);
        }
        
        // Return empty array if no pair found (though problem guarantees one)
        return new int[] {};
    }
}
