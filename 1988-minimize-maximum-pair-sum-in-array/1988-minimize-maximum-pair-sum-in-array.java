// Approach: Sorting + Two-Pointer Pairing
// 1. Sort the array in ascending order to easily pair smallest and largest elements.
// 2. Use two pointers — 'left' at the start and 'right' at the end of the array.
// 3. Pair elements as (nums[left], nums[right]) and calculate their sum.
// 4. Track the maximum pair sum among all such pairs.
// 5. Return this maximum sum as the minimum possible "maximum pair sum" after optimal pairing.
//
// Time complexity: O(n log n) – due to sorting
// Space complexity: O(1) – sorting done in-place, constant extra space used

class Solution {
    public int minPairSum(int[] nums) {
        int maxPairSum = 0;

        // Step 1: Sort array to make pairing easier
        Arrays.sort(nums);

        // Step 2: Use two-pointer approach to form pairs
        for (int left = 0, right = nums.length - 1; left < right; left++, right--) {
            int pairSum = nums[left] + nums[right];
            maxPairSum = Math.max(maxPairSum, pairSum);
        }

        // Step 3: Return the maximum pair sum found
        return maxPairSum;
    }
}
