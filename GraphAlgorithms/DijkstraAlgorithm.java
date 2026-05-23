/**
 * Problem ID: 183
 * Topic: GraphAlgorithms
 * Problem Name: DijkstraAlgorithm
 * Difficulty: Medium
 * Description: Finds shortest paths from source using a PriorityQueue.
 *
 * Time Complexity: O((V + E) log V)
 * Space Complexity: O(V)
 */
import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Arrays;
public class DijkstraAlgorithm {
    static class Node {
        int target, weight;
        Node(int target, int weight) { this.target = target; this.weight = weight; }
    }
    public static int[] dijkstra(int V, List<List<Node>> adj, int src) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);
        pq.add(new Node(src, 0));
        while (!pq.isEmpty()) {
            Node curr = pq.poll();
            for (Node neighbor : adj.get(curr.target)) {
                if (dist[curr.target] + neighbor.weight < dist[neighbor.target]) {
                    dist[neighbor.target] = dist[curr.target] + neighbor.weight;
                    pq.add(new Node(neighbor.target, dist[neighbor.target]));
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        int V = 3;
        List<List<Node>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        adj.get(0).add(new Node(1, 1));
        adj.get(0).add(new Node(2, 6));
        adj.get(1).add(new Node(2, 3));
        int[] dists = dijkstra(V, adj, 0);
        for (int d : dists) System.out.print(d + " "); // 0 1 4
    }
}
