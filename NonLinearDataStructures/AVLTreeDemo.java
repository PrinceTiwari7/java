/**
 * Problem ID: 79
 * Topic: NonLinearDataStructures
 * Problem Name: AVLTreeDemo
 * Difficulty: Hard
 * Description: Implements insertion with left/right rotations in an AVL balanced BST.
 *
 * Time Complexity: O(log N)
 * Space Complexity: O(N)
 */
public class AVLTreeDemo {
    static class Node {
        int val, height;
        Node left, right;
        Node(int val) { this.val = val; height = 1; }
    }
    private static int height(Node n) { return n == null ? 0 : n.height; }
    private static int getBalance(Node n) { return n == null ? 0 : height(n.left) - height(n.right); }
    private static Node rightRotate(Node y) {
        Node x = y.left; Node T2 = x.right;
        x.right = y; y.left = T2;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        return x;
    }
    private static Node leftRotate(Node x) {
        Node y = x.right; Node T2 = y.left;
        y.left = x; x.right = T2;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        return y;
    }
    public static Node insert(Node node, int val) {
        if (node == null) return new Node(val);
        if (val < node.val) node.left = insert(node.left, val);
        else if (val > node.val) node.right = insert(node.right, val);
        else return node;
        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);
        if (balance > 1 && val < node.left.val) return rightRotate(node);
        if (balance < -1 && val > node.right.val) return leftRotate(node);
        if (balance > 1 && val > node.left.val) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balance < -1 && val < node.right.val) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }
    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30); // Triggers left rotate on 10
        System.out.println("New root: " + root.val); // Should be 20
    }
}
