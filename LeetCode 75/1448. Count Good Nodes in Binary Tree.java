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
    public int goodNodes(TreeNode root) {

        int maxNum = root.val;
        int count = 0;

        count += traverse(root, maxNum);       

        return count;        
    }

    public int traverse(TreeNode root, int maxNum) {

        int count = 0;

        if (root == null) {
            return 0;
        }

        if (root.val >= maxNum) {
            maxNum = root.val;
            count++;
        }

        count += traverse(root.left, maxNum);
        count += traverse(root.right, maxNum);

        return count;        
    }
}