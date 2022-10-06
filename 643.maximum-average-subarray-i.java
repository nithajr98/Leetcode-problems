/*
 * @lc app=leetcode id=643 lang=java
 *
 * [643] Maximum Average Subarray I
 */

// @lc code=start
class Solution {
    public double findMaxAverage(int[] nums, int k) {
               
        double curmax=Integer.MIN_VALUE;

        int start=0,end=k-1;
        double sum=0;
        for(int i=start;i<=end;i++){
            sum+=nums[i];
        }
        while(end<nums.length){

            if(sum>curmax){
                curmax =sum;
            }
            sum-=nums[start];
            start++;
            end++;
            if(end<nums.length){
                sum+=nums[end];
            }
            
            
        }
        return curmax/k;
    }
    
}
// @lc code=end

