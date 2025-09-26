// Approach: For each 3x3 subgrid in the given n x n grid:
// 1. Slide a window of size 3x3 starting at each valid top-left position.
// 2. Find the maximum value in that 3x3 window using nested loops.
// 3. Store the maximum in the corresponding position of the result matrix.
// Time complexity: O(n^2) * O(3*3) → O(n^2) since 3x3 is constant
// Space complexity: O((n-2)^2) → O(n^2) for the result matrix

class Solution {
    public int[][] largestLocal(int[][] grid) {
        int gridSize = grid.length;
        int[][] resultMatrix = new int[gridSize - 2][gridSize - 2];
        
        for (int i = 0; i < gridSize - 2; i++) {
            for (int j = 0; j < gridSize - 2; j++) {
                int max = 0;
                
                for (int row = i; row < i + 3; row++) {
                    for (int col = j; col < j + 3; col++) {
                        if (max < grid[row][col]) {
                            max = grid[row][col];
                        }
                    }
                }

                resultMatrix[i][j] = max;
            }
        }
        return resultMatrix;
    }
}