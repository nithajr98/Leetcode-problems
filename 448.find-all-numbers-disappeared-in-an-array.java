import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 * @lc app=leetcode id=448 lang=java
 *
 * [448] Find All Numbers Disappeared in an Array
 */

// @lc code=start
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> res = new HashSet<Integer>();
        // int idx=-1;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<0){
        //         idx=-nums[i]-1;
        //     }else{
        //         idx=nums[i]-1;
        //     }

        //     if(nums[idx]>0){
        //         nums[idx]=-nums[idx];
        //     }
        // }
        for(int i=1;i<=nums.length;i++){
            res.add(i);
        }
        for(int i=0;i<nums.length;i++){
            if(res.contains(nums[i])){
                res.remove((Integer)nums[i]);
            }
        }
       
        return new ArrayList<>(res);
        
    }
}
// @lc code=end

