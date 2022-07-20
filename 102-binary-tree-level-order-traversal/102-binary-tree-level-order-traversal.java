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
    List<List<Integer>> result; //Global variable DECLARE
    public List<List<Integer>> levelOrder(TreeNode root) {
        result= new ArrayList<>(); //INITIALIZE
        if(root==null){
            return result;
        }
        helper(root, 0); //root aur level bhejo
        return result;
    }
    public void helper(TreeNode root, int level){
        if(root==null){
            return;
        }
        if(result.size()==level){
            result.add(new ArrayList<>());
        }
        result.get(level).add(root.val); //result mein level ke index pe
        helper(root.left, level+1);
        helper(root.right, level+1);
    }
}