/**
 * Problem ID: 56
 * Topic: LinearDataStructures
 * Problem Name: QueueLinkedList
 * Difficulty: Easy
 * Description: Implements a FIFO queue using a Singly Linked List.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(N)
 */
public class QueueLinkedList {
    static class Node {
        int val; Node next;
        Node(int val) { this.val = val; }
    }
    private Node front = null, rear = null;
    public void enqueue(int val) {
        Node newNode = new Node(val);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
    public int dequeue() {
        if (front == null) throw new RuntimeException("Queue empty");
        int val = front.val;
        front = front.next;
        if (front == null) rear = null;
        return val;
    }
    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.enqueue(5); q.enqueue(10);
        System.out.println(q.dequeue() + " " + q.dequeue());
    }
}
