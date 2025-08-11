/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        
        int res=0;
        String resstring="";


        for(int i=0;i<s.length();i++){
            int r=i,l=i;

            while(l>=0&&s.charAt(i)==s.charAt(l)){
                l--;
            }
            while(r<s.length()&&s.charAt(i)==s.charAt(r)){
                r++;
            }
            int dound=r;
            while(l>=0 &&r<s.length()&&s.charAt(r)==s.charAt(l)){
                r++;
                l--;
            }
            String pali=s.substring(l+1, r);

            resstring=pali.length()>resstring.length()?pali:resstring;

            i=dound-1;

        }
        return resstring;
    }
}
// @lc code=end

