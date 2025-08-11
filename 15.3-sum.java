/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res =new ArrayList();

        for(int i=0;i<nums.length;i++){
            int target =-nums[i];
            HashSet<Integer> set = new HashSet();
            
            String a ;
                
            for(int j=i+1;j<nums.length;j++){
                int diff = target-nums[j];
                ArrayList<Integer> temparr = new ArrayList();
                
                if(set.contains(diff)){
                    System.out.print(nums[i]+" "+nums[j]+" "+diff);
                    temparr.add(nums[i]);
                    temparr.add(nums[j]);
                    temparr.add(diff);
                    temparr.sort(null);;

                    res.add(temparr);                                   
                }
                set.add(nums[j]);
            }
            System.out.println();            
        }
        return res;
    }
}
// @lc code=end

