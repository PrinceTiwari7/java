/**
 * Problem ID: 70
 * Topic: NonLinearDataStructures
 * Problem Name: BinaryTreeHeight
 * Difficulty: Easy
 * Description: Calculates the maximum height/depth of a binary tree.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(H)
 */
public class BinaryTreeHeight {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        System.out.println("Height: " + maxDepth(root));
    }
}
