class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int [] squares = new int[n];
        
        for(int i = 0; i < n; i++){
            squares[i] = nums[i] * nums[i];
        }

        Arrays.sort(squares);

        return squares;
    }
}