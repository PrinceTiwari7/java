/**
 * Problem ID: 71
 * Topic: NonLinearDataStructures
 * Problem Name: BinaryTreeDiameter
 * Difficulty: Medium
 * Description: Calculates the diameter of a binary tree (longest path between nodes).
 *
 * Time Complexity: O(N)
 * Space Complexity: O(H)
 */
public class BinaryTreeDiameter {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
    private static int diameter = 0;
    public static int getDiameter(TreeNode root) {
        diameter = 0;
        height(root);
        return diameter;
    }
    private static int height(TreeNode node) {
        if (node == null) return 0;
        int leftH = height(node.left);
        int rightH = height(node.right);
        diameter = Math.max(diameter, leftH + rightH);
        return 1 + Math.max(leftH, rightH);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2); root.right = new TreeNode(3);
        System.out.println("Diameter: " + getDiameter(root));
    }
}
