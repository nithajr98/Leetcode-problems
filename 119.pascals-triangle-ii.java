import java.util.ArrayList;

/*
 * @lc app=leetcode id=119 lang=java
 *
 * [119] Pascal's Triangle II
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int stored =0;
        int xx=0;
        res.add(1);
        for(int i=1;i<=rowIndex;i++){
            for(int j=1;j<=i;j++){
                if(j==i){
                    res.add(1);
                }else{
                    if(j==1){
                        stored=res.get(j);
                        res.set(j, stored+res.get(j-1));
                    }else{
                        xx=res.get(j);
                        res.set(j, stored+res.get(j));
                        stored = xx;

                    }
                    
                    
                }
            }
            
            
        }
        return res;
    }
    
}
// @lc code=end

