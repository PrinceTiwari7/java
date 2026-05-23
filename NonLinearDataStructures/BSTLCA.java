public class BSTLCA {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        TreeNode p = root.left = new TreeNode(2);
        TreeNode q = root.right = new TreeNode(8);
        System.out.println("LCA: " + lowestCommonAncestor(root, p, q).val); // 6
    }
}
