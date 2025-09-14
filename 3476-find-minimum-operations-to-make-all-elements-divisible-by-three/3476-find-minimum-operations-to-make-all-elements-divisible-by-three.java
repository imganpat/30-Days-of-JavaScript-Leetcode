// Approach: Brute Force
// Time Complexity: O(n)
// Space Conplexity: O(1)

class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for(int num: nums){
            if(num % 3 != 0){
                count++;
            }
        }
        return count;
    }
}