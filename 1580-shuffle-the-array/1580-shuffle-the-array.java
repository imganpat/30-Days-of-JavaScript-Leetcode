// Approach: Two Pointer
// Time Complexity: O(n)
// Space Somplexity: O(n)

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] res = new int[nums.length];
        int a = 0;
        for(int i = 0; i < res.length ;){
            res[i++] = nums[a++];
            res[i++] = nums[n++];
        }
        return res;
    }
}