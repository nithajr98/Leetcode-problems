import java.sql.Array;
import java.util.HashSet;
import java.util.Set;

import javafx.util.converter.NumberStringConverter;

/*
 * @lc app=leetcode id=414 lang=java
 *
 * [414] Third Maximum Number
 */

// @lc code=start
class Solution {
    public int thirdMax(int[] nums) {
        Integer one=null;
        Integer two=null;
        Integer three=null;
        
        for(Integer i : nums){
            if(i.equals(one)||i.equals(two)||i.equals(three))continue;
            if(one==null||i>one){
                three=two;
                two=one;
                one=i;
            }else if(two==null || i>two){
                three=two;
                two=i;
            }else if(three==null ||i>three){
                three=i;
            }
        }
        return three==null?one:three;


    }
}
// @lc code=end

