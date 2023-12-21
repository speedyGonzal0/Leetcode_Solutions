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

        ArrayList<Integer> values = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<>();

        if (root == null) {
            return values;
        }

        stack.push(root);

        while (!stack.empty()) {
            TreeNode visiting = stack.pop();
            values.add(visiting.val);

            if (visiting.right != null) {
                stack.push(visiting.right);
            }
            if (visiting.left != null) {
                stack.push(visiting.left);
            }
        }

        // preorder(root, values);

        return values;        
    }

    // public void preorder(TreeNode root, ArrayList<Integer> values) {
    //     if (root == null) {
    //         return;
    //     }

    //     values.add(root.val);
    //     preorder(root.left, values);
    //     preorder(root.right, values);
    // }
}