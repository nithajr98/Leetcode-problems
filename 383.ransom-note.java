import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] char1 = ransomNote.toCharArray();
        char[] char2 = magazine.toCharArray();

        int[] alpha = new int[26];

        for(int i=0;i<ransomNote.length();i++){
            alpha[char1[i]-'a']++;
        }
        for(int i=0;i<magazine.length();i++){
            alpha[char2[i]-'a']--;
        }

        for(int i=0;i<alpha.length;i++){
            if(alpha[i]>0){
                return false;
            }
        }
        return true;
        


    }
}
// @lc code=end

