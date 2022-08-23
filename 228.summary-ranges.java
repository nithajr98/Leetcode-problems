import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=228 lang=java
 *
 * [228] Summary Ranges
 */

// @lc code=start
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<String>();
        int n=nums.length;
        if(n==0){
            return res;
        }
        if(n==1){
            
            res.add(nums[0]+"");
        }
        int start=0,end=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1)
            {
                end++;
                continue;
            }else if(start==end){
                res.add(""+nums[end]);
            }else{
                
                res.add(nums[start]+"->"+nums[end]);
                end++;
                start=end;
            }

            

        }
        return res;
    }
}
// @lc code=end

