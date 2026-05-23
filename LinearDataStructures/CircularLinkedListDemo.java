public class CircularLinkedListDemo {
    static class Node {
        int val; Node next;
        Node(int val) { this.val = val; }
    }
    public static Node insert(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }
        Node curr = head;
        while (curr.next != head) curr = curr.next;
        curr.next = newNode;
        newNode.next = head;
        return head;
    }
    public static void print(Node head) {
        if (head == null) return;
        Node curr = head;
        do {
            System.out.print(curr.val + " ");
            curr = curr.next;
        } while (curr != head);
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = null;
        head = insert(head, 10);
        head = insert(head, 20);
        head = insert(head, 30);
        print(head);
    }
}
