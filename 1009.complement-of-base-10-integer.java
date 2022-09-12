import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * @lc app=leetcode id=1009 lang=java
 *
 * [1009] Complement of Base 10 Integer
 */

// @lc code=start
class Solution {
    public int bitwiseComplement(int n) {
        Queue<Integer> s = new LinkedList<Integer>();
        if(n==0){
            return 1;
        }
        while(n!=0){
            s.add(compli(n%2));
            n/=2;
        }
        
        int answr=0;
        int pow=0;
        while(!s.isEmpty()){
            int y= s.peek();
            s.poll();
            answr+=(1<<pow)*y;
            pow++;
            
        }
        
        return answr;
    }
    public int compli(int a){
        return a==1?0:1;
    }
}
// @lc code=end

