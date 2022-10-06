import java.util.HashSet;
import java.util.Set;

import javax.xml.stream.events.Characters;

/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        

        Set<Character> set=new HashSet<>();
        int max=0;
        int start =0;
        int i=0;
        while(i<n){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i++));
                max=Math.max(max, set.size());
            }else{
                set.remove(s.charAt(start++));
            }

        }
        return max;
    }
}
// @lc code=end

