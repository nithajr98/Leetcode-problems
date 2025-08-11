/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int colh = 0, coll = 0, rowh = 0, rowl = 0;
        rowh = row - 1;
        colh = col - 1;
        while (rowl < rowh) {
            int midr = (rowh + rowl) / 2;

            if (matrix[midr][0] < target) {
                rowl = midr + 1;

            } else {
                rowh = midr;

            }
        }

        int currow = rowl > rowh ? rowh : rowl;
        System.out.println(currow);
        while (coll < colh) {
            int midc = (coll + colh) / 2;

            if (matrix[currow][midc] < target) {
                coll = midc + 1;

            } else {
                colh = midc;

            }
        }

        System.out.println(coll);
        System.out.println(matrix[currow][coll]);

        return matrix[currow][coll] == target;
    }
}
// @lc code=end
