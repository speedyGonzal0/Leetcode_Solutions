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

        ArrayList<Integer> values = new ArrayList<>();
        
        // traverse(root, values);

        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root;

        while (curr != null || !stack.empty()) {
            if (curr != null) {
                stack.push(curr);
                values.addFirst(curr.val);
                curr = curr.right;
            }
            else {
                TreeNode node = stack.pop();
                curr = node.left;
            }
        }        

        return values;        
    }

    // public void traverse(TreeNode root, ArrayList<Integer> values) {
    //     if (root == null) {
    //         return;
    //     }

    //     traverse(root.left, values);
    //     traverse(root.right, values);
    //     values.add(root.val);
    // }
}