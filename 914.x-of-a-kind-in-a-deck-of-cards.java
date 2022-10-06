import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/*
 * @lc app=leetcode id=914 lang=java
 *
 * [914] X of a Kind in a Deck of Cards
 */

// @lc code=start
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10000];

        for(int i=0;i<deck.length;i++){
            count[deck[i]]++;
        }
        int gcd1=count[0];

        for(int i=1;i<count.length;i++){
            
            gcd1=gcd(count[i],gcd1);

        }
        

        if(gcd1<2){
            return false;
        }
        return true;
    }
    public int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }

}
// @lc code=end

