/**
 * Problem ID: 218
 * Topic: CommonCodingPatterns
 * Problem Name: FastSlowMiddleNode
 * Difficulty: Easy
 * Description: Finds the middle node of a linked list using slow and fast pointers.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class FastSlowMiddleNode {
    static class Node {
        int val; Node next;
        Node(int val) { this.val = val; }
    }
    public static Node getMiddle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node head = new Node(1); head.next = new Node(2); head.next.next = new Node(3);
        System.out.println("Middle node: " + getMiddle(head).val); // 2
    }
}
