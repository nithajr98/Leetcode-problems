import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int longest=0;

        for(Integer i:set){
            if(!set.contains(i-1)){
                int length=0;
                while(set.contains(i+length)){
                    length++;
                }
                longest=Math.max(length,longest);
            }
        }
        return longest;
    }
}
// @lc code=end

