/*
 * @lc app=leetcode id=687 lang=java
 *
 * [687] Longest Univalue Path
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int longestUnivaluePath(TreeNode root) {
        // hypothesis
        // longestpath(TreeNode) = gives longest path
        // longest(root) = 2
        // longest(root->right)=1
        // longest(root->left)=0
        if (root.left == null && root.right == null) {
            return 0;
        }
        int leftlongest = 0;
        int rightlongest = 0;
        if (root.left != null && root.left.val == root.val) {
            leftlongest = longestUnivaluePath(root.left) + 1;
        }
        if (root.right != null && root.right.val == root.val) {
            rightlongest = longestUnivaluePath(root.right) + 1;
        }
        int longestvalue = leftlongest + rightlongest;

        return longestvalue;
    }
}
// @lc code=end
