// Approach: Brute Force
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> lessThanList = new ArrayList<>();
        List<Integer> greaterThanList = new ArrayList<>();
        int pivotCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < pivot) {
                lessThanList.add(nums[i]);
            }
            else if (nums[i] > pivot) {
                greaterThanList.add(nums[i]);
            }
            else {
                pivotCount++;
            }
        }

        int i = 0;
        for(; i < lessThanList.size(); i++){
            nums[i] = lessThanList.get(i);
        }
        for(; i < lessThanList.size() + pivotCount; i++){
            nums[i] = pivot;
        }
        for(; i < lessThanList.size() + pivotCount + greaterThanList.size() ; i++){
            nums[i] = greaterThanList.get(i - (lessThanList.size() + pivotCount));
        }

        return nums;

    }
}