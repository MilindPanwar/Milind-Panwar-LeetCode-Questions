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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null || nums.length==0){
            return null;
        }
        return makeBST(nums, 0, nums.length-1);
    }
    static TreeNode makeBST(int[] nums, int low, int hi){
        if(low>hi){
            return null;
        }
        int mid= (low+hi)/2;
        var root= new TreeNode(nums[mid]);
        root.left= makeBST(nums,low, mid-1);
        root.right= makeBST(nums, mid+1, hi);
        return root;
    }
}