import javafx.util.converter.NumberStringConverter;

/*
 * @lc app=leetcode id=724 lang=java
 *
 * [724] Find Pivot Index
 */

// @lc code=start
class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        if(n==0||nums==null){
            return -1;
        }
        if(n==1){
            return 0;
        }
        int[] presum = new int[n];
        int[] revsum = new int[n];
        
        for(int i=0;i<n;i++){
            if(i==0){
                presum[i]=0;
                
                continue;
            }
            presum[i]=presum[i-1]+nums[i-1];
            
        }
        
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                revsum[i]=0;
                
                continue;
            }
            revsum[i]=revsum[i+1]+nums[i+1];
            
        }
        for(int i=0;i<n;i++){
            if(presum[i]==revsum[i]){
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end

