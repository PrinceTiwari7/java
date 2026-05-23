/**
 * Problem ID: 75
 * Topic: NonLinearDataStructures
 * Problem Name: BSTSearch
 * Difficulty: Easy
 * Description: Searches for a key in a Binary Search Tree.
 *
 * Time Complexity: O(H)
 * Space Complexity: O(H)
 */
public class BSTSearch {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
    public static TreeNode search(TreeNode root, int key) {
        if (root == null || root.val == key) return root;
        if (key < root.val) return search(root.left, key);
        return search(root.right, key);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5); root.right = new TreeNode(15);
        System.out.println("Found: " + (search(root, 15) != null));
    }
}
