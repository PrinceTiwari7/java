/**
 * Problem ID: 55
 * Topic: LinearDataStructures
 * Problem Name: QueueArray
 * Difficulty: Easy
 * Description: Implements a FIFO queue using fixed-size arrays.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(N)
 */
public class QueueArray {
    private int[] arr;
    private int front, rear, size, capacity;
    public QueueArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0; rear = -1; size = 0;
    }
    public void enqueue(int val) {
        if (size == capacity) throw new RuntimeException("Queue full");
        rear = (rear + 1) % capacity;
        arr[rear] = val;
        size++;
    }
    public int dequeue() {
        if (size == 0) throw new RuntimeException("Queue empty");
        int val = arr[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }
    public static void main(String[] args) {
        QueueArray q = new QueueArray(3);
        q.enqueue(10); q.enqueue(20);
        System.out.println(q.dequeue() + " " + q.dequeue());
    }
}
