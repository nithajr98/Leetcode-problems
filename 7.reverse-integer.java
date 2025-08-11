/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int num=0;int flag=0;
        int res=0;
        if(x<0){
            flag=1;
            x=-x;
        }
        
        while(x!=0){
            
            num=num*10+x%10;
            if(num/10!=res){
                return 0;
            }

            
            x=x/10;
            res=num;
        }
        if(num>Integer.MAX_VALUE||num<Integer.MIN_VALUE){
            return 0;
        }
        return flag==0?num:-num;
    }
}
// @lc code=end

