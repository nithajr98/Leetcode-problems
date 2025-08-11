/*
 * @lc app=leetcode id=1022 lang=java
 *
 * [1022] Sum of Root To Leaf Binary Numbers
 */

// @lc code=start

import java.util.LinkedList;
import java.util.Queue;

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

    public int sumRootToLeaf(TreeNode root) {
        String num = "";
        int result = 0;

        result = dfs(root, 0);
        return result;

    }

    public int dfs(TreeNode node, int currentSum) {

        if (node == null) {
            // System.out.println(num);
            return 0;
        }

        System.out.println(node.val);
        currentSum = currentSum * 2 + node.val;
        // if (node.left != null)
        if (node.left == null && node.right == null) {

            return currentSum;

        }
        int leftsum = dfs(node.left, currentSum);
        // if (node.right != null)
        int rightsum = dfs(node.right, currentSum);
        // System.out.println("leftsum " + leftsum + "righsum " + rightsum);
        return leftsum + rightsum;

    }
}
// @lc code=end
