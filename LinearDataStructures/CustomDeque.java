public class CustomDeque {
    static class Node {
        int val; Node prev, next;
        Node(int val) { this.val = val; }
    }
    private Node head = null, tail = null;
    public void insertFront(int val) {
        Node newNode = new Node(val);
        if (head == null) head = tail = newNode;
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void insertLast(int val) {
        Node newNode = new Node(val);
        if (tail == null) head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public int removeFront() {
        if (head == null) throw new RuntimeException("Empty");
        int val = head.val;
        head = head.next;
        if (head != null) head.prev = null;
        else tail = null;
        return val;
    }
    public int removeLast() {
        if (tail == null) throw new RuntimeException("Empty");
        int val = tail.val;
        tail = tail.prev;
        if (tail != null) tail.next = null;
        else head = null;
        return val;
    }
    public static void main(String[] args) {
        CustomDeque dq = new CustomDeque();
        dq.insertFront(10); dq.insertLast(20);
        System.out.println("Front: " + dq.removeFront() + ", Last: " + dq.removeLast());
    }
}
