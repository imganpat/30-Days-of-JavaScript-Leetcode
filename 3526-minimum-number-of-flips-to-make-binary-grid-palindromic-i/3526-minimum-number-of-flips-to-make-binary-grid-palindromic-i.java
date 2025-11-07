class Solution {
    public int minFlips(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int rowCount = 0, colCount =  0;

        for (int i = 0; i < r; i++) {
            for (int left = 0, right = c - 1; left < right; left++, right--) {
                if (grid[i][left] != grid[i][right]) {
                    rowCount++;
                }
            }
        }
        for (int i = 0; i < c; i++) {
            for (int left = 0, right = r - 1; left < right; left++, right--) {
                if (grid[left][i] != grid[right][i]) {
                    colCount++;
                }
            }
        }

        return Math.min(rowCount,  colCount);
    }
}