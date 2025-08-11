import java.util.LinkedList;
import java.util.Stack;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;
import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=226 lang=java
 *
 * [226] Invert Binary Tree
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
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> st = new LinkedList<>();
        if(root==null){
            return null;
        }
        st.offer(root);

        while(!st.isEmpty()){
            TreeNode curNode =st.poll();
            
            
            TreeNode left =curNode.left;
            curNode.left =curNode.right;
            curNode.right =left;
            
            if(curNode.left!=null){
                st.offer(curNode.left);
            }
            if(curNode.right!=null){
                st.offer(curNode.right);
            }
    
            


        }

        return root;

    }
}
// @lc code=end

