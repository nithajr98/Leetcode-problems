/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int sell=0;

        int profit=0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];

            }
            sell = prices[i]-buy;
            if(sell>profit){
                profit=sell;
            }
        }
        return profit;
    }
}
// @lc code=end

