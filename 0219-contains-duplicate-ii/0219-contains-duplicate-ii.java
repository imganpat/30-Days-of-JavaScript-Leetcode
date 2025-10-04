// Approach: Sliding Window with HashSet
// 1. Use a HashSet as a window to store the last 'k' elements.
// 2. Iterate through the array, checking if nums[i] already exists in the window.
//    - If yes → duplicate found within distance 'k' → return true.
// 3. Add nums[i] to the window and ensure the window size remains ≤ k
//    by removing the element that is more than k positions behind.
// 4. If no duplicates found within distance k, return false.

// Time complexity: O(n) – each element is added and removed at most once
// Space complexity: O(k) – HashSet stores at most k elements at a time

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            // If the window already contains nums[i], duplicate found
            if (window.contains(nums[i])) {
                return true;
            }

             // Add current number to the window
            window.add(nums[i]);

            // Keep window size ≤ k
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }
        return false;
    }
}