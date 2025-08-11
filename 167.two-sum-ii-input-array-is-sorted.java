import java.util.Arrays;

/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int r=nums.length-1;int l=0;
        
        while(r>l){
            if(nums[l]+nums[r]>target){
                r--;
            }else if(nums[l]+nums[r]<target){
                l++;
            }else {
                return new int[] {l+1,r+1};
            }
        }
        return new int[] {1,2};
        
    }
}
// @lc code=end

