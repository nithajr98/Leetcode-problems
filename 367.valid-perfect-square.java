/*
 * @lc app=leetcode id=367 lang=java
 *
 * [367] Valid Perfect Square
 */

// @lc code=start
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1||num==0){
            return true;
        }
        long l=1;
        long r=num/2;

        while(l<=r){
            long mid = l+ (r-l)/2;
            long  t=mid*mid;
            if(t<num){
                l=mid+1;
                
            }else if(t>num){
                r=mid-1;
            }else{
                return true;
            }
          
        }
        
        return false;
    }
}
// @lc code=end

