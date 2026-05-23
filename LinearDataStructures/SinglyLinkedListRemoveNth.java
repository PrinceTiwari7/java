public class SinglyLinkedListRemoveNth {
    static class Node {
        int val; Node next;
        Node(int val) { this.val = val; }
    }
    public static Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node slow = dummy, fast = dummy;
        for (int i = 0; i <= n; i++) fast = fast.next;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
    public static void main(String[] args) {
        Node head = new Node(1); head.next = new Node(2); head.next.next = new Node(3);
        head = removeNthFromEnd(head, 2); // Removes 2
        for (Node c = head; c != null; c = c.next) System.out.print(c.val + " ");
    }
}
