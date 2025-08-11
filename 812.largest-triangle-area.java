/*
 * @lc app=leetcode id=812 lang=java
 *
 * [812] Largest Triangle Area
 */

// @lc code=start
class Solution {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double maxarea=0;
        double temparea=0;
        
        if(n<3){
            return 0;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    
                    temparea = (points[i][0]*(points[j][1]-points[k][1])+points[j][0]*(points[k][1]-points[i][1])+points[k][0]*(points[i][1]-points[j][1]));
                    
                    if(temparea<0){
                        temparea=-temparea;
                    }
                    if(temparea>maxarea){
                        maxarea=temparea;
                    }
                    
                }
                
            }

        }
        return maxarea/2;
    }
}
// @lc code=end

