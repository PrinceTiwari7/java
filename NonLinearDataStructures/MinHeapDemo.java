/**
 * Problem ID: 80
 * Topic: NonLinearDataStructures
 * Problem Name: MinHeapDemo
 * Difficulty: Medium
 * Description: Implements insertion and extractMin in a Min-Heap binary array structure.
 *
 * Time Complexity: O(log N)
 * Space Complexity: O(N)
 */
import java.util.Arrays;
public class MinHeapDemo {
    private int[] heap = new int[10];
    private int size = 0;
    public void insert(int val) {
        if (size == heap.length) heap = Arrays.copyOf(heap, heap.length * 2);
        heap[size] = val;
        heapifyUp(size);
        size++;
    }
    public int extractMin() {
        if (size == 0) throw new IllegalStateException();
        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return min;
    }
    private void heapifyUp(int idx) {
        while (idx > 0 && heap[idx] < heap[(idx - 1) / 2]) {
            swap(idx, (idx - 1) / 2);
            idx = (idx - 1) / 2;
        }
    }
    private void heapifyDown(int idx) {
        while (idx * 2 + 1 < size) {
            int left = idx * 2 + 1, right = idx * 2 + 2, smallest = left;
            if (right < size && heap[right] < heap[left]) smallest = right;
            if (heap[idx] <= heap[smallest]) break;
            swap(idx, smallest);
            idx = smallest;
        }
    }
    private void swap(int i, int j) {
        int temp = heap[i]; heap[i] = heap[j]; heap[j] = temp;
    }
    public static void main(String[] args) {
        MinHeapDemo h = new MinHeapDemo();
        h.insert(15); h.insert(5); h.insert(20);
        System.out.println("Extract min: " + h.extractMin()); // 5
    }
}
