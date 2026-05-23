/**
 * Problem ID: 42
 * Topic: LinearDataStructures
 * Problem Name: SinglyLinkedListInsert
 * Difficulty: Easy
 * Description: Demonstrates insertions at head, tail, and specific positions.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
public class SinglyLinkedListInsert {
    static class Node {
        int val; Node next;
        Node(int val) { this.val = val; }
    }
    public static Node insertAtHead(Node head, int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        return newNode;
    }
    public static Node insertAtTail(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) return newNode;
        Node curr = head;
        while (curr.next != null) curr = curr.next;
        curr.next = newNode;
        return head;
    }
    public static void print(Node head) {
        for (Node c = head; c != null; c = c.next) System.out.print(c.val + " -> ");
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head = null;
        head = insertAtHead(head, 2);
        head = insertAtHead(head, 1);
        head = insertAtTail(head, 3);
        print(head);
    }
}
