// Title: Increasing Order Search Tree
            // Difficulty: Unknown
            // Language: Java
            // Link: https://leetcode.com/problems/increasing-order-search-tree/

class Solution {
    private TreeNode current;

    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode(-1);
        current = dummy;

        inorder(root);

        return dummy.right;
    }

    private void inorder(TreeNode node) {
        if (node == null) {
            return;
