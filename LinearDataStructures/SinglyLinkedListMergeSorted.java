/**
 * Problem ID: 47
 * Topic: LinearDataStructures
 * Problem Name: SinglyLinkedListMergeSorted
 * Difficulty: Easy
 * Description: Merges two sorted lists into one sorted list recursively.
 *
 * Time Complexity: O(N + M)
 * Space Complexity: O(N + M)
 */
public class SinglyLinkedListMergeSorted {
    static class Node {
        int val; Node next;
        Node(int val) { this.val = val; }
    }
    public static Node merge(Node l1, Node l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }
    public static void main(String[] args) {
        Node l1 = new Node(1); l1.next = new Node(3);
        Node l2 = new Node(2); l2.next = new Node(4);
        Node res = merge(l1, l2);
        for (Node c = res; c != null; c = c.next) System.out.print(c.val + " ");
    }
}
