/*
 * @lc app=leetcode id=892 lang=java
 *
 * [892] Surface Area of 3D Shapes
 */

// @lc code=start
class Solution {
    public int surfaceArea(int[][] grid) {
        int totalA=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                
                int area=0;
                if(grid[i][j]!=0){
                    area=2+grid[i][j]*4;
                }else{
                    continue;
                }
                
                
                
                if(j>0){
                    
                    if(grid[i][j-1]>grid[i][j]){
                        area=area-grid[i][j];
                    }else{
                        area=area-grid[i][j-1];//left
                    }
                }
                if(i>0){
                    
                    if(grid[i-1][j]>grid[i][j]){
                        area=area-grid[i][j];
                    }else{
                        area=area-grid[i-1][j];//up
                    }
                }
                if(j<grid.length-1){
                    
                    if(grid[i][j+1]>grid[i][j]){
                        area=area-grid[i][j];
                    }else{
                        area=area-grid[i][j+1];//right
                    }
                }
                if(i<grid.length-1){
                    
                    if(grid[i+1][j]>grid[i][j]){
                        area=area-grid[i][j];
                    }else{
                        area=area-grid[i+1][j];//down
                    }
                }
                totalA+=area;
                
                
            }
            
        }
        return totalA;
    }
}
// @lc code=end

