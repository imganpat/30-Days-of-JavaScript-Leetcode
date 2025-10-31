class Solution {
    public void sortColors(int[] nums) {
        int zerosCount = 0, onesCount = 0, twosCount = 0;
        for (int num : nums) {
            switch (num) {
                case 0 -> zerosCount++;
                case 1 -> onesCount++;
                case 2 -> twosCount++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < zerosCount) {
                nums[i] = 0;
            } else if (i < zerosCount + onesCount) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
    }
}