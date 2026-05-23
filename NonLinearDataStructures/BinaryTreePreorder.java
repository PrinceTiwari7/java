/**
 * Problem ID: 66
 * Topic: NonLinearDataStructures
 * Problem Name: BinaryTreePreorder
 * Difficulty: Easy
 * Description: Performs iterative preorder traversal on a binary tree.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
public class BinaryTreePreorder {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            res.add(curr.val);
            if (curr.right != null) stack.push(curr.right);
            if (curr.left != null) stack.push(curr.left);
        }
        return res;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println("Preorder: " + preorderTraversal(root));
    }
}
