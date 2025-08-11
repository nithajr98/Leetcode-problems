/*
 * @lc app=leetcode id=746 lang=java
 *
 * [746] Min Cost Climbing Stairs
 */

// @lc code=start
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int N=cost.length;
        int[] dp = new int[cost.length];
        dp[0]=cost[0];

        if(N>=2){
            dp[1]=cost[1];
        }
        for(int i=2;i<N;i++){
            dp[i]=Math.min(dp[i-1],dp[i-2])+cost[i];
        }
        
        return Math.min(dp[N-1],dp[N-2]);
    }
}
// @lc code=end

