import java.util.ArrayList;
import java.util.Stack;

/*
 * @lc app=leetcode id=682 lang=java
 *
 * [682] Baseball Game
 */

// @lc code=start
class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> score = new ArrayList<>();
        for(String val : operations){
            int size= score.size();
            switch(val){
                case "+":
                    score.add(score.get(size-1)+score.get(size-2));

                    break;
                case "D":
                    score.add(score.get(size-1)*2);
                    break;
                case "C":
                    score.remove(size-1);
                    break;
                default:
                    score.add(Integer.parseInt(val));
                    break;

            }

        }
        int sum=0;
        for(int i=0;i<score.size();i++){
            sum+=score.get(i);
        }
        return sum;

    }
}
// @lc code=end

