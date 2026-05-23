import java.util.Arrays;
public class BellmanFordAlgorithm {
    static class Edge {
        int src, dest, weight;
        Edge(int src, int dest, int weight) { this.src = src; this.dest = dest; this.weight = weight; }
    }
    public static int[] bellmanFord(int V, Edge[] edges, int src) {
        int[] dist = new int[V];
        Arrays.fill(dist, 10000000); // infinity proxy
        dist[src] = 0;
        for (int i = 1; i < V; i++) {
            for (Edge edge : edges) {
                if (dist[edge.src] != 10000000 && dist[edge.src] + edge.weight < dist[edge.dest]) {
                    dist[edge.dest] = dist[edge.src] + edge.weight;
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        Edge[] edges = { new Edge(0, 1, -1), new Edge(0, 2, 4), new Edge(1, 2, 3) };
        int[] dist = bellmanFord(3, edges, 0);
        for (int d : dist) System.out.print(d + " "); // 0 -1 2
    }
}
