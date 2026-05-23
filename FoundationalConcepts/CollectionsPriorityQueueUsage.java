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
