import java.util.HashMap;
import java.util.Hashtable;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            Integer diff = target-nums[i];
            if(map.containsKey(diff)){
                return new int[] {map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
}
// @lc code=end

