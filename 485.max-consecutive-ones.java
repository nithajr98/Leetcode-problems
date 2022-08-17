import javax.print.attribute.standard.NumberUpSupported;

/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int pro=1;int count =0;int max=0;
        for(int i=0;i<nums.length;i++){
            pro=pro*nums[i];
            
            if(pro==0){
                pro=1;
                if(count>max){
                    max=count;
                }
                count=0;
                continue;
            }
            count++;

        }
        if(count>max){
            max=count;
        }
        return max;
    }
}
// @lc code=end

