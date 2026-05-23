/**
 * Problem ID: 73
 * Topic: NonLinearDataStructures
 * Problem Name: BinaryTreeInvert
 * Difficulty: Easy
 * Description: Inverts a binary tree recursively (mirrors all left/right branches).
 *
 * Time Complexity: O(N)
 * Space Complexity: O(H)
 */
public class BinaryTreeInvert {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2); root.right = new TreeNode(3);
        invertTree(root);
        System.out.println("Inverted root left: " + root.left.val); // Should be 3
    }
}
