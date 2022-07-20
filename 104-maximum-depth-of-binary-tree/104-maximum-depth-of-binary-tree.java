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
        return helper(root);
    }

    public static int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int m1 = helper(root.left);
        int m2 = helper(root.right);
        return Math.max(m1,m2)+1;
    }
}
