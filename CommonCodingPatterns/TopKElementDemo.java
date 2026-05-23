/**
 * Problem ID: 220
 * Topic: CommonCodingPatterns
 * Problem Name: TopKElementDemo
 * Difficulty: Medium
 * Description: Finds the Kth largest element in an array using a Min-Heap.
 *
 * Time Complexity: O(N log K)
 * Space Complexity: O(K)
 */
import java.util.PriorityQueue;
public class TopKElementDemo {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) pq.poll();
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        System.out.println("3rd largest: " + findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2)); // 5
    }
}
