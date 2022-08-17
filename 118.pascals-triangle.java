import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>(); 
        
        

        res.get(0).add(1);
        for(int i=1;i<numRows;i++){
            ArrayList<Integer> row = new ArrayList<Integer>();
            int j=0;
            for(;j<=i;j++){
                if(j==i||j==0){
                    row.add(1);
                }else{
                    row.add(j,res.get(i-1).get(j) + res.get(i-1).get(j+1));
                }

            }
            res.add(row);
        }

        return res;
    }
}
// @lc code=end

