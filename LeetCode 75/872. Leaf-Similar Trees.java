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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        ArrayList<Integer> leaves1 = traverse(root1, new ArrayList<Integer>());
        ArrayList<Integer> leaves2 = traverse(root2, new ArrayList<Integer>());

        return leaves1.equals(leaves2);       
    }

    public static ArrayList<Integer> traverse(TreeNode root, ArrayList<Integer> res) {

        if (root == null) {
            return null;
        }

        if (root.left == null && root.right == null) {
            res.add(root.val);
        }

        traverse(root.left, res);
        traverse(root.right, res);

        return res;
    }
}