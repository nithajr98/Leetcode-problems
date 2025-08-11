/*
 * @lc app=leetcode id=338 lang=java
 *
 * [338] Counting Bits
 */

// @lc code=start
class Solution {
    public int[] countBits(int n) {
        int[] f = new int[n+1];

        for(int i=1;i<=n;i++) f[i]=1+f[i&(i-1)];
        return f;
        // int[] count = new int[n+1];
        // for(int i=0,j=0;i<=n;i++){
        //     int curcount=0;
        //     while(j!=0){
        //         j=j&(j-1);
        //         curcount++;
        //     }
        //     count[i]=curcount;
        //     j=i+1;
        // }
        // return count;
        
    }
}
// @lc code=end

