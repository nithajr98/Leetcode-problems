/*
 * @lc app=leetcode id=905 lang=java
 *
 * [905] Sort Array By Parity
 */

// @lc code=start
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l=0,r=nums.length-1;int temp;
        while(l<r){
            if(nums[l]%2!=0 &&nums[r]%2!=0){
                r--;
                
            }else if(nums[l]%2==0 &&nums[r]%2==0){
                l++;
                
            }else if(nums[l]%2!=0 &&nums[r]%2==0){
                temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l++;
                r--;
                
            }else if(nums[l]%2==0 &&nums[r]%2!=0){
                l++;
                r--;
                continue;
            }
        }
        return nums;
    }
}
// @lc code=end

