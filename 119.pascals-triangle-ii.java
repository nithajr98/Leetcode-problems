import java.util.ArrayList;

/*
 * @lc app=leetcode id=119 lang=java
 *
 * [119] Pascal's Triangle II
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int k) {
        Integer[] arr = new Integer[k + 1];
        Arrays.fill(arr, 0);
        arr[0] = 1;
        for(int i=1;i<=k;i++){
            for(int j=i;j>0;j--){
                arr[j] = arr[j] + arr[j - 1];
            }
            
            
        }
        return Arrays.asList(arr);
    }
    
}
// @lc code=end

