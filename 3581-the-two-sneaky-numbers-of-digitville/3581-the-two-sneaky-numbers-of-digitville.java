// Approach: Brute Force
// TIme Complexity: O(n ^ 2)
// Space Complexity: O(k)
// k is the number of dublicate elements

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        ArrayList<Integer> resList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    resList.add(nums[i]);
                }
            }
        }
        int [] res = new int[resList.size()];
        for(int i = 0; i < resList.size(); i++){
            res[i] = resList.get(i);
        }
        return res;
    }
}