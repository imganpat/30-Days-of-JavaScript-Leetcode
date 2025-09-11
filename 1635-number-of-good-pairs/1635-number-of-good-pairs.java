// Approach Brute Force. Optimized Solution (Using HashMap)
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num: nums){
            count += freq.getOrDefault(num, 0);
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        return count;
    }
}