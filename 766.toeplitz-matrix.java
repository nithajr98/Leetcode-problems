/*
 * @lc app=leetcode id=766 lang=java
 *
 * [766] Toeplitz Matrix
 */

// @lc code=start
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int k = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (i + 1 < r && j + 1 < c && matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false;
                }
            }
        }

        return true;

    }
}
// @lc code=end
