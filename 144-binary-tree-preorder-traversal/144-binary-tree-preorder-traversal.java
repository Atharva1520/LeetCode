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
     static ArrayList<Integer> ans ;
    public List<Integer> preorderTraversal(TreeNode root) {
       ans = new ArrayList<>();
        preorder(root);
        return ans;
    }
    static void preorder(TreeNode root){
        if(root == null){
            return ;
        }
        ans.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}