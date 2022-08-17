/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                return s.substring(i+1,s.length()).length();
            }
        }
        return s.length();
    }
}
// @lc code=end

