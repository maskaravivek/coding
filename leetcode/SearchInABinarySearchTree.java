
package leetcode;
// https://leetcode.com/problems/search-in-a-binary-search-tree/

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */

class SearchInABinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        if (val <= root.val) {
            return searchBST(root.left, val);
        }
        return searchBST(root.right, val);
    }
}