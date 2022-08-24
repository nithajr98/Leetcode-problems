/*
 * @lc app=leetcode id=717 lang=java
 *
 * [717] 1-bit and 2-bit Characters
 */

// @lc code=start
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        
        int n=bits.length;
        
        if(n==0||bits==null){
            return false;
        }else if(n==1 && bits[0]==0){
            return true;
        }

        for(int i=0;i<n;i++){
            if(bits[i]==0){
                if(i==n-1){
                    return true;
                }
                continue;  
            }else if(bits[i]==1 && bits[i+1]==0){
                i++;
            }else if(bits[i]==1 && bits[i+1]==1){
                i++;
            }
        }
        return false;
        
        
            
        
    }
}
// @lc code=end

