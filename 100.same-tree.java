import java.util.LinkedList;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(p);
        queue.add(q);

        while(!queue.isEmpty()){
            TreeNode f = queue.poll();
            TreeNode s = queue.poll();
            if(f==null&&s==null){
                continue;
            }else if(f==null||s==null||f.val!=s.val){
                return false;
            }
            
            queue.add(f.right);
            queue.add(s.right);
            queue.add(f.left);
            queue.add(s.left);
        }
        
        return true;
        
    }

}
// @lc code=end

