public class CircularQueue {
    private int[] data;
    private int head, tail, size, capacity;
    public CircularQueue(int k) {
        capacity = k;
        data = new int[k];
        head = 0; tail = -1; size = 0;
    }
    public boolean enQueue(int value) {
        if (size == capacity) return false;
        tail = (tail + 1) % capacity;
        data[tail] = value;
        size++;
        return true;
    }
    public boolean deQueue() {
        if (size == 0) return false;
        head = (head + 1) % capacity;
        size--;
        return true;
    }
    public int Front() { return size == 0 ? -1 : data[head]; }
    public int Rear() { return size == 0 ? -1 : data[tail]; }
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(3);
        System.out.println(cq.enQueue(1) + " " + cq.enQueue(2) + " " + cq.Front() + " " + cq.Rear());
    }
}
