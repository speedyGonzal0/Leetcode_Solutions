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
        // preorder(root, values);

        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root;

        while (curr != null || !stack.empty()) {
            if (curr != null) {
                stack.push(curr);
                values.add(curr.val);
                curr = curr.left;
            }
            else {
                TreeNode node = stack.pop();
                curr = node.right;
            }
        }

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