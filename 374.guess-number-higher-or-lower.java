/*
 * @lc app=leetcode id=374 lang=java
 *
 * [374] Guess Number Higher or Lower
 */

// @lc code=start
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l=1;int r=n;
        while(l<=r){
            int middle=l+(r-l)/2;
            
            if(guess(middle)==0){
                return middle;
            }else if(guess(middle)==-1){
                r=middle-1;
            }else{
                l=middle+1;
            }
        }
        return 1;
    }
}
// @lc code=end

