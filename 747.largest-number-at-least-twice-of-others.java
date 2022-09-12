/*
 * @lc app=leetcode id=747 lang=java
 *
 * [747] Largest Number At Least Twice of Others
 */

// @lc code=start
class Solution {
    public int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        int index=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                secmax=max;
                max=nums[i];
                index=i;
            }else if(nums[i]>secmax){
                secmax=nums[i];
            }
        }
        if(max>=2*secmax){
            return index;
        }
        return -1;
    }
}
// @lc code=end

