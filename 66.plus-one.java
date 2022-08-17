import java.io.CharArrayReader;

import javax.naming.spi.DirStateFactory;

/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length-1;
        int carry=1;
        int ind=n;
        while(carry!=0){
            
            if(digits[ind]==9){
                digits[ind]=0;
                carry=1;
            }else{
                digits[ind]+=1;
                carry=0;
            }
            ind--;
            if(ind<0 && carry==1){
                int[] res=new int[n+2];
                for(int i=n+1;i>0;i--){
                    res[i]=digits[i-1];

                }
                res[0]=1;
                System.out.println(res);
                return res;
            }
        }
        return digits;
        
    }
}
// @lc code=end

