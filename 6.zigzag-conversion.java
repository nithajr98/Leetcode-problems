/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] Zigzag Conversion
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {

        if(numRows<=1){
            return s;
        }
        StringBuilder[] ssr = new StringBuilder[numRows];
        char[] str = s.toCharArray();

        for(int i=0;i<numRows;i++){
            ssr[i]=new StringBuilder();
        }

        int idx=0,k=1;
        for(char c:str){
            ssr[idx].append(c);

            if(idx==0){
                k=1;
            }
            if(idx==numRows-1){
                k=-1;
            }
            idx+=k;
        }
              
        return String.join("", ssr);
    }
}
// @lc code=end

