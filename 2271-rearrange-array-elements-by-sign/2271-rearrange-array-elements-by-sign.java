// Approach: Two-Pointer Placement
// 1. Create a new array 'arr' to store the rearranged elements.
// 2. Maintain two separate pointers — 'posIndex' starting at 0 (even indices) for positive numbers,
//    and 'negIndex' starting at 1 (odd indices) for negative numbers.
// 3. Traverse the input array 'nums':
//    - If the number is positive, place it at 'posIndex' and increment by 2.
//    - If the number is negative, place it at 'negIndex' and increment by 2.
// 4. This ensures positives and negatives are placed alternately while maintaining their order.
// 5. Finally, return the rearranged array.
//
// Time complexity: O(n) – Single pass through the array
// Space complexity: O(n) – Extra array used for rearrangement

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posIndex = 0, negIndex = 1;
        int[] arr = new int[nums.length];

        for (int num : nums) {
            if (num > 0) {
                arr[posIndex] = num;
                posIndex += 2;
            } else {
                arr[negIndex] = num;
                negIndex += 2;
            }
        }
        return arr;
    }
}
