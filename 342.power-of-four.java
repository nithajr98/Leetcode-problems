/*
 * @lc app=leetcode id=342 lang=java
 *
 * [342] Power of Four
 */

// @lc code=start
class Solution {
    public boolean isPowerOfFour(int n) {
        return n>0 && (n&(n-1))==0 && (n&0x55555555) !=0;
    }
}
// @lc code=end

