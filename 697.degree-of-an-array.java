import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=697 lang=java
 *
 * [697] Degree of an Array
 */

// @lc code=start
class Solution {
    public int findShortestSubArray(int[] nums) {
        if(nums.length==0||nums==null){
            return 0;
        }
        Map<Integer,int[]>map=new HashMap();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], new int[] {1,i,i});
            }else{
                int[] temp=map.get(nums[i]);
                temp[0]++;
                temp[2]=i;
            }
        }



        int max=0; int res =0;
        for(int[] v : map.values()){
            if(v[0]>max){
                max=v[0];
                res=v[2]-v[1]+1;
            }else if(v[0]==max){
                res = Math.min(res,v[2]-v[1]+1);
            }
        }
        return res;

    }
}
// @lc code=end

