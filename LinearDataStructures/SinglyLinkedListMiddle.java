public class SinglyLinkedListMiddle {
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
        System.out.println("Middle: " + getMiddle(head).val);
    }
}
