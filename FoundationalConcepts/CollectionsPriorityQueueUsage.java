/**
 * Problem ID: 22
 * Topic: FoundationalConcepts
 * Problem Name: CollectionsPriorityQueueUsage
 * Difficulty: Easy
 * Description: Demonstrates Min-Heap implementation using PriorityQueue.
 *
 * Time Complexity: O(log N)
 * Space Complexity: O(N)
 */
import java.util.PriorityQueue;
public class CollectionsPriorityQueueUsage {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(5);
        pq.add(20);
        System.out.println("Peek min: " + pq.peek()); // 5
        System.out.println("Poll: " + pq.poll()); // 5
        System.out.println("New peek: " + pq.peek()); // 15
    }
}
