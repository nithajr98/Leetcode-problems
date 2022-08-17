import java.util.ArrayList;

/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int l=0;int zeros=0;int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zeros++;
            }else{
                nums[l]=nums[i];
                l++;
            }
        }
        while(zeros>0){
            nums[n-zeros]=0;
            zeros--;
        }
    }
}
// @lc code=end

