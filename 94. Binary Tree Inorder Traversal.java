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
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> values = new ArrayList<Integer>();
        // inorder(root, values);

        Stack<TreeNode> stack = new Stack<>();
        
        TreeNode curr = root;

        while (curr != null || !stack.empty()) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;                
            }
            else {
                TreeNode node = stack.pop();
                values.add(node.val);
                curr = node.right;
            }
        }

        return values;
    }

    // public void inorder(TreeNode root, List<Integer> values) {

    //     if (root == null) {
    //         return;
    //     }

    //     inorder(root.left, values);
    //     values.add(root.val);
    //     inorder(root.right, values);
    // }
}