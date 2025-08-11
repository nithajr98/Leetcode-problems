/*
 * @lc app=leetcode id=73 lang=java
 *
 * [73] Set Matrix Zeroes
 */

// @lc code=start
class Solution {
    public void setZero(int[][] matrix, int a, int b) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            matrix[i][b] = 0;
        }
        for (int i = 0; i < m; i++) {
            matrix[a][i] = 0;
        }
    }

    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] skiprow = new int[n];
        int[] skipcol = new int[m];
        int[][] zeros = new int[n*m][2];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // if (matrix[i][j] == 0 && skipcol[j] != 1 && skiprow[i] != 1) {
                //     skiprow[i] = 1;
                //     skipcol[j] = 1;
                //     setZero(matrix, i, j);
                // }
                if(matrix[i][j]==0){
                    zeros[i][j]=0;
                }
            }
        }
    }

    
}
// @lc code=end
