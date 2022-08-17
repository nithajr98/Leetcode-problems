import java.util.Queue;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=104 lang=java
 *
 * [104] Maximum Depth of Binary Tree
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
    public int maxDepth(TreeNode root) {
        // if( root ==null){
        //     return 0;
        // }
        // Queue<TreeNode> queue = new LinkedList<TreeNode>();
        // int height=0;
        // queue.add(root);
        // while(!queue.isEmpty()){
        //     height++;
        //     int size = queue.size();

        //     for(int i=0;i<size;i++){
        //         TreeNode curr = queue.poll();

        //         if(curr.left!=null){
        //             queue.add(curr.left);
        //         }
        //         if(curr.right!=null){
        //             queue.add(curr.right);
        //         }
        //     }
        // }
        // return height;

        
         if(root==null) return 0;
          
          int ldepth=maxDepth(root.left);
          int rdepth=maxDepth(root.right);
          
          return Math.max(ldepth,rdepth)+1;
         
    }
    


   
}
// @lc code=end

