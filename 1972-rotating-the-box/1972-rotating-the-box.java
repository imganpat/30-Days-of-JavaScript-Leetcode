// Approach: Simulate Gravity + Rotate Matrix
// 1. First, simulate the effect of gravity for each row in the box.
//    - Stones ('#') fall to the right until blocked by an obstacle ('*') or another stone.
//    - Use a pointer 'right' to track the next available position where a stone can fall.
// 2. After simulating gravity, rotate the box 90° clockwise.
//    - For a cell (i, j) in the original box, its new position after rotation becomes (j, rows - 1 - i).
// 3. Return the rotated box as the final result.
//
// Time complexity: O(m × n) – each cell is visited a constant number of times
// Space complexity: O(m × n) – new matrix created for the rotated box

class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int rows = boxGrid.length;
        int cols = boxGrid[0].length;
        char[][] rotatedBox = new char[cols][rows];

        // Step 1: Simulate gravity in each row
        for (int i = 0; i < rows; i++) {
            int right = cols - 1; // pointer to place next stone
            for (int j = cols - 1; j >= 0; j--) {
                if (boxGrid[i][j] == '#') {
                    // Move stone to the farthest possible right position
                    boxGrid[i][j] = '.';
                    boxGrid[i][right] = '#';
                    right--;
                } else if (boxGrid[i][j] == '*') {
                    // Reset 'right' pointer when obstacle found
                    right = j - 1;
                }
            }
        }

        // Step 2: Rotate the box 90° clockwise
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotatedBox[j][rows - 1 - i] = boxGrid[i][j];
            }
        }

        // Step 3: Return the rotated box
        return rotatedBox;
    }
}
