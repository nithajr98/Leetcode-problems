/*
 * @lc app=leetcode id=45 lang=java
 *
 * [45] Jump Game II
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int jumpHelp(int curPos,int[] nums,int[]dp ){
        if(curPos==nums.length-1){
            return 0;
        }
        
    }

    public int jump(int[] nums) {
        
        int[] dp =new int[nums.length];
        Arrays.fill(dp, -1);

        dp[0]=0;
        if(nums[0]>0){
            dp[1]=1;
        }


    }
}
// @lc code=end
