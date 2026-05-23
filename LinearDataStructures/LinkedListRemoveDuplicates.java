/**
 * Problem ID: 64
 * Topic: LinearDataStructures
 * Problem Name: LinkedListRemoveDuplicates
 * Difficulty: Easy
 * Description: Removes duplicate nodes from sorted linked list.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class LinkedListRemoveDuplicates {
    static class Node {
        int val; Node next;
        Node(int val) { this.val = val; }
    }
    public static Node deleteDuplicates(Node head) {
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(1); head.next = new Node(1); head.next.next = new Node(2);
        head = deleteDuplicates(head);
        for (Node c = head; c != null; c = c.next) System.out.print(c.val + " ");
    }
}
