/**
 * Problem ID: 89
 * Topic: NonLinearDataStructures
 * Problem Name: NonLinearSubTree89
 * Difficulty: Easy
 * Description: Solving Binary Tree / Graph helper problem variation 1.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(H)
 */
public class NonLinearSubTree89 {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
    public static int countNodes(TreeNode root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        System.out.println("Nodes count: " + countNodes(root));
    }
}
