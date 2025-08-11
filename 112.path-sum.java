import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.Vector;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=112 lang=java
 *
 * [112] Path Sum
 */

// @lc code=start
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
    public boolean hasPathSum(TreeNode root, int targetSum) {



        if(root==null){
            return false;
        }
        if(root.right==null&&root.left==null&&root.val==targetSum){
            return true;
        }
        return hasPathSum(root.right, targetSum-root.val)||hasPathSum(root.left, targetSum-root.val);



      /*   
        if(root==null){
            return false;
        }
        Stack<TreeNode>stack = new Stack<>();
        
        
        stack.add(root);
        while(!stack.isEmpty()){
            
            int size =stack.size();
            
                TreeNode node =stack.peek();
                
                
                stack.pop();
                if(node.left==null&&node.right==null){
                    
                    if(node.val==targetSum){
                        return true;
                    }
                    
                    
                    
                    
                }
                if(node.right!=null){
                    stack.add(node.right);
                    node.right.val+=node.val;
                }
                if(node.left!=null){

                    stack.add(node.left);
                    node.left.val+=node.val;
                }
                
                
            
            
            
        }


        return false;
        */
    }
   



}
// @lc code=end

