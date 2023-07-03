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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        
        if (nums.length == 1){
            return new TreeNode( nums[0] );
        }

        if (nums.length < 1){
            return null;
        }

        int max = -1;
        int maxPos = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
                maxPos = i; 
            }
        }

        int [] left = new int[maxPos];
        int [] right = new int[nums.length - maxPos - 1];

        for (int i = 0; i < maxPos; i++){
            left[i] = nums[i];
        }

        for (int i = 0, j = maxPos + 1; i < right.length; i++, j++){
            right[i] = nums[j];
        }

        TreeNode t = new TreeNode(max);
        t.left = constructMaximumBinaryTree( left );
        t.right = constructMaximumBinaryTree( right );

        return t;
        
    }
}