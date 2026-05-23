/**
 * Problem ID: 69
 * Topic: NonLinearDataStructures
 * Problem Name: BinaryTreeLevelOrder
 * Difficulty: Easy
 * Description: Performs level-order traversal on a binary tree using BFS.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
public class BinaryTreeLevelOrder {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = q.poll();
                level.add(curr.val);
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            res.add(level);
        }
        return res;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9); root.right = new TreeNode(20);
        System.out.println("Level Order: " + levelOrder(root));
    }
}
