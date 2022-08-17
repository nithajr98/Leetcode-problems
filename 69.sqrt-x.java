/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        if(x==1)return 1;
        
        int high=x/2;
        int low=1;
      

        while(low<=high){
            int mid=(high+low)/2;
            
            if(mid==x/mid){
                return mid;

        
            }else if(mid<x/mid){
                low=mid+1;
                

            }else{
                high=mid-1;
            }
            
        }
        return high;
        
    }
}
// @lc code=end

