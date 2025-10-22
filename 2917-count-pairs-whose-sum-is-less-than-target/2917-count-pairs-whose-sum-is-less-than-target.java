// Approach: Sorting + Two-Pointer
// 1. Sort the list so pairs can be evaluated with two pointers efficiently.
// 2. Use two pointers: 'i' at start and 'j' at end.
// 3. If nums[i] + nums[j] < target, then all elements between i and j paired with nums[i]
//    will also be < target (because sorted). Add (j - i) to count and increment i.
// 4. Otherwise, decrement j to try a smaller sum.
// 5. Continue until i >= j and return the accumulated count.
//
// Time complexity: O(n log n) – due to sorting
// Space complexity: O(1) – ignoring input sorting overhead (in-place), only constant extra space used

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        // Sort to allow two-pointer technique
        Collections.sort(nums);

        int i = 0;
        int j = nums.size() - 1;
        int count = 0;

        // Two-pointer traversal
        while (i < j) {
            int pairSum = nums.get(i) + nums.get(j);

            // If sum < target, all elements between i and j paired with nums[i] are valid
            if (pairSum < target) {
                count += j - i;
                i++; // move left pointer to consider next element
            } else {
                j--; // sum too large, move right pointer left to reduce sum
            }
        }

        return count;
    }
}
