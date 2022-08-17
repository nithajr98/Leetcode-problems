/*
 * @lc app=leetcode id=566 lang=java
 *
 * [566] Reshape the Matrix
 */

// @lc code=start
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] res=new int[r][c];
        int oldr=mat.length;int oldc=mat[0].length;
        if(r*c!=oldc*oldr){
            return mat;
        }
        int a=0,b=0;
        
        for(int[]  nums :mat){
            for(int i : nums){

                if(b==c-1){
                    res[a][b]=i;
                    a++;
                    b=0;
                    continue;
                }
                res[a][b]=i;
                b++;

            }
        }
        return res;
    }
}
// @lc code=end

