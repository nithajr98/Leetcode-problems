/*
 * @lc app=leetcode id=198 lang=java
 *
 * [198] House Robber
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        
        int N=nums.length;
        int[] dp =new int[N];


        dp[0]=nums[0];
        if(N==1){
            return nums[0];
        }
        dp[1]=nums[0]>nums[1]?nums[0]:nums[1];

        for(int i=2;i<N;i++){
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
            
        }

        return dp[N-1];



        //7 1 2 9 3
    }
}
// @lc code=end

