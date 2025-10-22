// Approach: Sorting + Two-Pointer
// 1. Create a new ArrayList copy to avoid mutating the original list.
// 2. Sort the list so pairs can be efficiently checked using two pointers.
// 3. Initialize two pointers: 'i' at start, 'j' at end.
// 4. If list[i] + list[j] < target, all pairs between i and j with list[i] will also be < target
//    because the list is sorted. Add (j - i) to count and increment i.
// 5. Otherwise, decrement j to reduce the sum.
// 6. Continue until i >= j, and finally return the total count.
//
// Time complexity: O(n log n) — due to sorting
// Space complexity: O(n) — due to creating a new ArrayList copy

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        ArrayList<Integer> list = new ArrayList<>(nums);

        // Sort to allow two-pointer technique
        Collections.sort(list);

        int i = 0;
        int j = list.size() - 1;
        int count = 0;

        // Two-pointer traversal
        while (i < j) {
            int pairSum = list.get(i) + list.get(j);

            // If sum < target, all elements between i and j paired with list[i] are valid
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
