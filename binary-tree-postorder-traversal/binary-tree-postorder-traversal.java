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
    public List<Integer> postorderTraversal(TreeNode root) {
        return helper(root, new ArrayList());
    }
    public static List<Integer> helper(TreeNode root, List<Integer> list){
        if(root==null){
            return list;
        }
        helper(root.left, list); //root.val left mein jaega, null se milke aega
        helper(root.right, list); //phir root.val right mein jaega, null se milke aega
        list.add(root.val); //root.val add hojaega
        return list;
    }
}