// Approach : Two Pointer 
// Time Complexity: O(n)
// Space Complexity: (n)
class Solution {
    public int[] transformArray(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0, left = 0, right = nums.length - 1; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                res[left++] = 0;
            }else{
                res[right--] = 1;
            }
        }
        return res;
    }
}