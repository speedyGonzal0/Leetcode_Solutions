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
        Stack<TreeNode> nodes = new Stack<>();
        
        TreeNode curr = root;

        while (curr != null || !nodes.empty()) {
            while (curr != null) {
                nodes.add(curr);
                curr = curr.left;
            }

            curr = nodes.pop();
            values.add(curr.val);
            curr = curr.right;            
        }


        // inorder(root, values);

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