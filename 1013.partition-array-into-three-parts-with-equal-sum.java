import java.util.Arrays;

/*
 * @lc app=leetcode id=1013 lang=java
 *
 * [1013] Partition Array Into Three Parts With Equal Sum
 */

// @lc code=start
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }

        if(sum%3!=0){
            return false;
        }
        int each =sum/3;int temp=0;int found=0;
        for(int i=0;i<arr.length;i++){
            temp+=arr[i];
            if(temp==each){
                temp=0;
                found++;
            }
            if(i==arr.length-1&&found==3){
                return true;
            }
        }
        return found>=3?true:false;
    }
}
// @lc code=end

