public class SinglyLinkedListDelete {
    static class Node {
        int val; Node next;
        Node(int val) { this.val = val; }
    }
    public static Node deleteNode(Node head, int target) {
        if (head == null) return null;
        if (head.val == target) return head.next;
        Node curr = head;
        while (curr.next != null && curr.next.val != target) {
            curr = curr.next;
        }
        if (curr.next != null) curr.next = curr.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head = deleteNode(head, 2);
        for (Node c = head; c != null; c = c.next) System.out.print(c.val + " ");
    }
}
