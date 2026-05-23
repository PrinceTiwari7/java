/**
 * Problem ID: 181
 * Topic: GraphAlgorithms
 * Problem Name: GraphBFS
 * Difficulty: Easy
 * Description: Performs Breadth-First Search traversal on a graph.
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V)
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
public class GraphBFS {
    public static List<Integer> bfs(int V, List<List<Integer>> adj) {
        List<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(0); visited[0] = true;
        while (!q.isEmpty()) {
            int node = q.poll();
            res.add(node);
            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int V = 4;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        adj.get(0).add(1); adj.get(0).add(2); adj.get(1).add(2); adj.get(2).add(3);
        System.out.println("BFS: " + bfs(V, adj));
    }
}
