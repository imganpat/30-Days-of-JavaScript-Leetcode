// Approach: Two-Pointer Technique (Greedy Optimization)
// 1. Initialize two pointers — 'left' at the start and 'right' at the end of the array.
// 2. The area formed between the lines at 'left' and 'right' is determined by:
//      area = min(height[left], height[right]) * (right - left)
// 3. Update maxArea whenever a larger area is found.
// 4. Move the pointer that has the smaller height inward because the height limits the area,
//    and moving the smaller one might lead to a taller line and a potentially larger area.
// 5. Continue until the two pointers meet, ensuring all possible container combinations are checked.
// 6. Return the maximum area found.
//
// Time complexity: O(n) – each index is visited at most once
// Space complexity: O(1) – only a few integer variables are used

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0, left = 0, right = height.length - 1;

        // Two-pointer traversal
        while (left < right) {
            // Calculate current area between lines
            int currentArea = Math.min(height[left], height[right]) * (right - left);

            // Update maximum area if larger area is found
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer with smaller height inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        // Return the maximum area found
        return maxArea;
    }
}
