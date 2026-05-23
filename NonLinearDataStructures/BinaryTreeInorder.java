/**
 * Problem ID: 67
 * Topic: NonLinearDataStructures
 * Problem Name: BinaryTreeInorder
 * Difficulty: Easy
 * Description: Performs iterative inorder traversal on a binary tree.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
public class BinaryTreeInorder {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2); root.right.left = new TreeNode(3);
        System.out.println("Inorder: " + inorderTraversal(root));
    }
}
