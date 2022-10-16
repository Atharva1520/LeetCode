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
    TreeNode ans = new TreeNode();
    TreeNode temp = ans;
    public TreeNode increasingBST(TreeNode root) {
        if(root == null)return null;
        increasingBST(root.left);
        ans=ans.right  = new TreeNode(root.val);
        increasingBST(root.right);
        return temp.right;
    }
}