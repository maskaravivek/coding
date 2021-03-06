// https://leetcode.com/problems/binary-tree-level-order-traversal-ii

package leetcode.trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import leetcode.TreeNode;

class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Queue<List<TreeNode>> queue = new LinkedList<>();
        queue.add(Arrays.asList(root));

        while (!queue.isEmpty()) {
            List<TreeNode> level = queue.poll();
            List<Integer> numbers = new ArrayList<>();
            List<TreeNode> nodes = new ArrayList<>();
            for (TreeNode node : level) {
                numbers.add(node.val);
                if (node.left != null) {
                    nodes.add(node.left);
                }
                if (node.right != null) {
                    nodes.add(node.right);
                }
            }
            result.add(numbers);
            if (nodes.size() > 0) {
                queue.add(nodes);
            }
        }
        Collections.reverse(result);
        return result;
    }
}