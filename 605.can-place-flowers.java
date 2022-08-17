import java.util.Arrays;

/*
 * @lc app=leetcode id=605 lang=java
 *
 * [605] Can Place Flowers
 */

// @lc code=start
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int num) {
        int n= flowerbed.length;
        int[] temp = new int[n];
        if(flowerbed.length==1&&flowerbed[0]==0){
            return num<=1?true:false;
        }
        if(flowerbed.length==1&&flowerbed[0]==1){
            return num==0?true:false;
        }
        
        Arrays.fill(temp, 1);
        
        int p=0;
        for(int i=0;i<n;i++){
            if(flowerbed[i]==1){
                temp[i]=0;
                if(i>0){
                    temp[i-1]=0;
                }
                if(i<n-1){
                    temp[i+1]=0;
                }
                
                
            }
        }
        for(int i=0;i<n-1;i++){

            if(temp[i]==1&&temp[i+1]==1){
                temp[i+1]=0;
                
            }
        }
        if(temp[n-1]==1&&temp[n-2]==1){
            temp[n-1]=0;
        }
        for(int i=0;i<n;i++){
            if(temp[i]==1){
                p++;
            }
            
        }

        return p>=num?true:false;
    }
}
// @lc code=end

