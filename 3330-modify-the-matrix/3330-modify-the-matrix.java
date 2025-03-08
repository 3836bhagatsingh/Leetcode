class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int n = matrix.length;    // Number of rows
        int m = matrix[0].length; // Number of columns
        int[] maxInColumn = new int[m]; // Array to store the maximum value in each column

        // Step 1: Find the maximum value in each column
        for (int col = 0; col < m; col++) {
            int max = -1;
            for (int row = 0; row < n; row++) {
                if (matrix[row][col] > max) {
                    max = matrix[row][col];
                }
            }
            maxInColumn[col] = max; // Store the maximum value of the current column
        }

        // Step 2: Replace all -1 values with the maximum value of their respective columns
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (matrix[row][col] == -1) {
                    matrix[row][col] = maxInColumn[col];
                }
            }
        }

        return matrix;
    }
}