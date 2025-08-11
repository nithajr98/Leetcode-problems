/*
 * @lc app=leetcode id=152 lang=java
 *
 * [152] Maximum Product Subarray
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {
        int product=1,maxpro=1;
        int r=0;
        for(int i=0;i<nums.length;i++){
            product*=nums[i];
            if(product>maxpro){
                maxpro=product;
            }
            if(product==0){
                r=i+1;
                product=1;
                continue;
            }
        }
    }
}
// @lc code=end

