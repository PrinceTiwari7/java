import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
public class TopologicalSortKahn {
    public static List<Integer> topoSort(int V, List<List<Integer>> adj) {
        int[] inDegree = new int[V];
        for (List<Integer> list : adj) {
            for (int neighbor : list) inDegree[neighbor]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) if (inDegree[i] == 0) q.add(i);
        List<Integer> res = new ArrayList<>();
        while (!q.isEmpty()) {
            int curr = q.poll();
            res.add(curr);
            for (int neighbor : adj.get(curr)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) q.add(neighbor);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int V = 3;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        adj.get(0).add(1); adj.get(1).add(2);
        System.out.println("Topological Sort: " + topoSort(V, adj));
    }
}
