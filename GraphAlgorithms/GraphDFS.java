/**
 * Problem ID: 182
 * Topic: GraphAlgorithms
 * Problem Name: GraphDFS
 * Difficulty: Easy
 * Description: Performs Depth-First Search traversal on a graph recursively.
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V)
 */
import java.util.List;
import java.util.ArrayList;
public class GraphDFS {
    public static List<Integer> dfs(int V, List<List<Integer>> adj) {
        List<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[V];
        dfsHelper(0, adj, visited, res);
        return res;
    }
    private static void dfsHelper(int node, List<List<Integer>> adj, boolean[] visited, List<Integer> res) {
        visited[node] = true;
        res.add(node);
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) dfsHelper(neighbor, adj, visited, res);
        }
    }
    public static void main(String[] args) {
        int V = 4;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        adj.get(0).add(1); adj.get(0).add(2); adj.get(1).add(2); adj.get(2).add(3);
        System.out.println("DFS: " + dfs(V, adj));
    }
}
