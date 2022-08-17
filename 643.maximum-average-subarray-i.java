/*
 * @lc app=leetcode id=643 lang=java
 *
 * [643] Maximum Average Subarray I
 */

// @lc code=start
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int[] presum = new int[nums.length];
        
        double max=0;
        double curmax=0;int j=0;

        int start=0,end=0;
        presum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            presum[i]=nums[i]+presum[i-1];
            curmax = (presum[i]-presum[j])/(i-j);
            if(curmax>max){
                max=curmax;
            }
        }
        return max;
    }
}
// @lc code=end

