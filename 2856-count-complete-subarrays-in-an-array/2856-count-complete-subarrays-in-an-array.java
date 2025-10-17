// Approach: Sliding Window with HashMap for Frequency Counting
// 1. First, determine the number of unique elements 'n' in the array using a HashSet.
// 2. Use a sliding window with pointers 'start' and 'end' and a frequency map (freqMap) 
//    to track counts of elements in the current window.
// 3. Expand the window by moving 'end' and updating freqMap.
// 4. When freqMap contains all 'n' unique elements, all subarrays starting from 'start' 
//    to the end of the array are complete, so add (nums.length - end) to count.
// 5. Shrink the window from the left (move 'start') and update freqMap accordingly, 
//    removing elements whose frequency drops to zero.
// 6. Continue until all windows are processed and return the total count of complete subarrays.
//
// Time complexity: O(n) – each element is added and removed at most once from the map
// Space complexity: O(n) – for storing frequency map and unique elements

class Solution {
    public int countCompleteSubarrays(int[] nums) {
        // Step 1: Get the total number of unique elements
        Set<Integer> uniqueElements = new HashSet<>();
        for (int i : nums) {
            uniqueElements.add(i);
        }
        int n = uniqueElements.size();

        // Step 2: Initialize frequency map and count
        Map<Integer, Integer> freqMap = new HashMap<>();
        int count = 0;

        // Step 3: Sliding window
        for (int start = 0, end = 0; end < nums.length; end++) {
            // Add current element to freqMap
            freqMap.put(nums[end], freqMap.getOrDefault(nums[end], 0) + 1);

            // Shrink window from the left while all unique elements are included
            while (freqMap.size() == n) {
                // Add the number of subarrays ending beyond current 'end'
                count += nums.length - end;

                // Remove or decrement frequency of nums[start]
                freqMap.put(nums[start], freqMap.get(nums[start]) - 1);
                if (freqMap.get(nums[start]) == 0) {
                    freqMap.remove(nums[start]);
                }
                start++;
            }
        }

        // Step 4: Return total count of complete subarrays
        return count;
    }
}
