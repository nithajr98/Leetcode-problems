/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Integer,Integer> map = new HashMap();
        
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if(map.containsKey(diff)){
                return new int[] {map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {};

        
    }
}
// @lc code=end

