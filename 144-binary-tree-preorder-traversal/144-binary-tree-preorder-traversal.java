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

    public List<Integer> preorderTraversal(TreeNode root) {
        return helper(root, new ArrayList());
    }

    public static List<Integer> helper(TreeNode root, List<Integer> list) {
        if (root == null) {
            return list;
        }
        list.add(root.val); //root ki value list mein daldo

        helper(root.left, list); //Tree mein left side badjao, recursion call lagao
        helper(root.right, list); //Tree mein rigth side badjao, recursion call lagao
        return list;
    }
}
