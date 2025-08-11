/*
 * @lc app=leetcode id=872 lang=java
 *
 * [872] Leaf-Similar Trees
 */

// @lc code=start

import java.util.ArrayList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void printtree(TreeNode node,ArrayList<Integer> val){
        if(node==null){

        }else if(node.left==null&&node.right==null){
            val.add(node.val);
        }else{
            
            printtree(node.left,val);

            printtree(node.right,val);
            Math.sqrt(0)

            
        }
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer>val1,val2;
        val1 = new ArrayList<>();
        val2= new ArrayList<>();
        printtree(root1,val1);
       printtree(root2,val2);
       System.out.println(val1.toString());
       System.out.println(val2.toString());
        if(val1.equals(val2)){
            return true;
        }
        return false;
    }
}
// @lc code=end

