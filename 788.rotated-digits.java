import java.util.ArrayList;

/*
 * @lc app=leetcode id=788 lang=java
 *
 * [788] Rotated Digits
 */

// @lc code=start
class Solution {
    public int rotatedDigits(int n) {
        ArrayList<Integer> arr =new ArrayList<Integer>();

        while(n!=0){
            int r=n%10;
            n=n/10;
            arr.add(r);
            
        }
        int res=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==3||arr.get(i)==7||arr.get(i)==4){
                continue;
            }
            res++;
        }
        return res;
    }
}
// @lc code=end

