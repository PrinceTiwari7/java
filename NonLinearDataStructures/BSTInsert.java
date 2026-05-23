public class BSTInsert {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.val) root.left = insert(root.left, val);
        else if (val > root.val) root.right = insert(root.right, val);
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = null;
        root = insert(root, 10);
        root = insert(root, 5);
        root = insert(root, 15);
        System.out.println("Root: " + root.val + ", Left: " + root.left.val + ", Right: " + root.right.val);
    }
}
