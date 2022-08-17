import java.util.HashSet;

/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        int xor=0,i=0;
        for(;i<nums.length;i++){
            xor=xor^i^nums[i];
        }

        

        return xor^i;


    }
}
// @lc code=end

