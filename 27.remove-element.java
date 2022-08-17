/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int l=nums.length;
        for(int i=0;i<l;i++){
            if(nums[i] == val){
                nums[i] = nums[l-1];
                i--;
                l--;
            }
        }
        return l;
    }
}
// @lc code=end

