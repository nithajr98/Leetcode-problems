/*
 * @lc app=leetcode id=674 lang=java
 *
 * [674] Longest Continuous Increasing Subsequence
 */

// @lc code=start
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int curl=1;
        int mxl=1;

        

        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>nums[i-1]){
                curl++;
                continue;
            }else{
                if(curl>mxl){
                    mxl=curl;
                    curl=0;
                }
                curl=0;
                
            }
        }
        return mxl;
    }
}
// @lc code=end

