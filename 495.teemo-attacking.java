import java.util.HashSet;

/*
 * @lc app=leetcode id=495 lang=java
 *
 * [495] Teemo Attacking
 */

// @lc code=start
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int num=0;
        
        
        for(int i=0;i<timeSeries.length-1;i++){
            if(timeSeries[i+1]<=timeSeries[i]+duration-1){
                num+=timeSeries[i+1]-timeSeries[i];

            }else{
                num+=duration;
            }
        }
        num+=duration;
        return num;

    }
}
// @lc code=end

