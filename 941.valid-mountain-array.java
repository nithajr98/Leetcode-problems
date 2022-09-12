/*
 * @lc app=leetcode id=941 lang=java
 *
 * [941] Valid Mountain Array
 */

// @lc code=start
class Solution {
    public boolean validMountainArray(int[] nums) {
        int order=1;
        if(nums.length<3){
            return false;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]>nums[i]){
                order*=1;
            }else if(nums[i+1]<nums[i]){
                order=-1;
            }

            if(nums[i]==nums[i+1]){
                return false;
            }else if(nums[i]<nums[i+1] && order ==-1){
                return false;
            }else if(i==nums.length-2 && order ==1 && nums[i+1]>nums[i]){
                return false;
            }else if(i==0 && nums[i+1]<nums[i] ){
                return false;
            }

            
        }
        return true;
    }
}
// @lc code=end

