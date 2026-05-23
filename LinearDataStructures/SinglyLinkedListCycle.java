/**
 * Problem ID: 45
 * Topic: LinearDataStructures
 * Problem Name: SinglyLinkedListCycle
 * Difficulty: Easy
 * Description: Checks if a Singly Linked List contains a cycle using Floyd's algorithm.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class SinglyLinkedListCycle {
    static class Node {
        int val; Node next;
        Node(int val) { this.val = val; }
    }
    public static boolean hasCycle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = head; // Cycle
        System.out.println("Has cycle: " + hasCycle(head));
    }
}
