import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=111 lang=java
 *
 * [111] Minimum Depth of Binary Tree
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
    public int minDepth(TreeNode root) {


        if(root==null){
            return 0;
        }

        Queue<TreeNode> q =new LinkedList<TreeNode>();
        q.add(root);
        int level=1;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node =q.poll();
                System.out.println(node.val);
                if(node.left==null&& node.right==null){
                    return level;
                }
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            
            

            level++;

        }
        return level;


        // TreeNode node = root;

        
        // if(root==null){
        //     return 0;
        // }
        
        // int resl= minDepth(root.left)+1;
        // int resr= minDepth(root.right)+1;
        
        // if(resl==1){
        //     return resr;
        // }else if(resr==1){
        //     return resl;

        // }else{
        //     return resl>resr||resl==1||resr==1?resr:resl;
        // }

       

        
    }
}
// @lc code=end

//(  (0)+1,(0)+1   )+1,((1,1)+1,(1,1)+1)+1
//2,(2,2)+1
//2,3