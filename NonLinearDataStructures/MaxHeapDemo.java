/**
 * Problem ID: 81
 * Topic: NonLinearDataStructures
 * Problem Name: MaxHeapDemo
 * Difficulty: Medium
 * Description: Implements insertion and extractMax in a Max-Heap structure.
 *
 * Time Complexity: O(log N)
 * Space Complexity: O(N)
 */
import java.util.Arrays;
public class MaxHeapDemo {
    private int[] heap = new int[10];
    private int size = 0;
    public void insert(int val) {
        if (size == heap.length) heap = Arrays.copyOf(heap, heap.length * 2);
        heap[size] = val;
        heapifyUp(size);
        size++;
    }
    public int extractMax() {
        if (size == 0) throw new IllegalStateException();
        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return max;
    }
    private void heapifyUp(int idx) {
        while (idx > 0 && heap[idx] > heap[(idx - 1) / 2]) {
            swap(idx, (idx - 1) / 2);
            idx = (idx - 1) / 2;
        }
    }
    private void heapifyDown(int idx) {
        while (idx * 2 + 1 < size) {
            int left = idx * 2 + 1, right = idx * 2 + 2, largest = left;
            if (right < size && heap[right] > heap[left]) largest = right;
            if (heap[idx] >= heap[largest]) break;
            swap(idx, largest);
            idx = largest;
        }
    }
    private void swap(int i, int j) {
        int temp = heap[i]; heap[i] = heap[j]; heap[j] = temp;
    }
    public static void main(String[] args) {
        MaxHeapDemo h = new MaxHeapDemo();
        h.insert(5); h.insert(15); h.insert(10);
        System.out.println("Extract max: " + h.extractMax()); // 15
    }
}
