/**
 * Problem ID: 85
 * Topic: NonLinearDataStructures
 * Problem Name: GraphAdjacencyList
 * Difficulty: Medium
 * Description: Implements a directed graph representation using Adjacency Lists.
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V + E)
 */
import java.util.List;
import java.util.ArrayList;
public class GraphAdjacencyList {
    private List<List<Integer>> adjList = new ArrayList<>();
    public GraphAdjacencyList(int vertices) {
        for (int i = 0; i < vertices; i++) adjList.add(new ArrayList<>());
    }
    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
    }
    public void printGraph() {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.println("Vertex " + i + " -> " + adjList.get(i));
        }
    }
    public static void main(String[] args) {
        GraphAdjacencyList g = new GraphAdjacencyList(4);
        g.addEdge(0, 1); g.addEdge(0, 2); g.addEdge(1, 2); g.addEdge(2, 3);
        g.printGraph();
    }
}
