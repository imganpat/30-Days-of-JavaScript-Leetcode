// Approach: Sorting + Two-Pointer (for each fixed element)
// 1. Sort the array to make it easier to apply the two-pointer technique and handle duplicates.
// 2. Iterate through the array, fixing one number `nums[i]` at a time (outer loop).
// 3. Use two pointers — `start` (i + 1) and `end` (n - 1):
//    - Calculate `sum = nums[i] + nums[start] + nums[end]`.
//    - If `sum == 0`, add the triplet to the result set (to avoid duplicates).
//    - If `sum > 0`, move `end--` to reduce the sum.
//    - If `sum < 0`, move `start++` to increase the sum.
// 4. Skip duplicate values for `nums[i]` to avoid repeated triplets.
// 5. Finally, return the result as a list of unique triplets.
//
// Time complexity: O(n²) – Outer loop (n) × Inner two-pointer traversal (n)
// Space complexity: O(n) – For storing unique triplets in the set

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Fix one element and use two pointers for the rest
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicate fixed elements
            }

            int start = i + 1; // Corrected pointer start (was 0 before)
            int end = nums.length - 1;

            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;

                    // Skip duplicates for start and end
                    while (start < end && nums[start] == nums[start - 1]) start++;
                    while (start < end && nums[end] == nums[end + 1]) end--;

                } else if (sum > 0) {
                    end--;
                } else {
                    start++;
                }
            }
        }

        return new ArrayList<>(res);
    }
}
