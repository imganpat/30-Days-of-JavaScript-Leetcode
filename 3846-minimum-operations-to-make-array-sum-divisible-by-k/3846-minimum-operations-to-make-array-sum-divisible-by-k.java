// Approach: Calculate the total sum, then take sum % k to find the minimum operations.
// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int number : nums) {
            sum += number;
        }
        return sum % k;
    }
}