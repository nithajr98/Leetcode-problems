import java.util.HashMap;

/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int max=0;int maxcount=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0 )+1);
        }
        for(Integer i : map.keySet()){
            if(map.get(i)>max){
                max=map.get(i);
                maxcount=i;
            }
        }
        
        return maxcount;
    }
}
// @lc code=end

