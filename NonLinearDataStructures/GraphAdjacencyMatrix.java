public class GraphAdjacencyMatrix {
    private boolean[][] adjMatrix;
    private int numVertices;
    public GraphAdjacencyMatrix(int vertices) {
        numVertices = vertices;
        adjMatrix = new boolean[vertices][vertices];
    }
    public void addEdge(int i, int j) { adjMatrix[i][j] = true; }
    public void removeEdge(int i, int j) { adjMatrix[i][j] = false; }
    public boolean hasEdge(int i, int j) { return adjMatrix[i][j]; }
    public static void main(String[] args) {
        GraphAdjacencyMatrix g = new GraphAdjacencyMatrix(4);
        g.addEdge(0, 1); g.addEdge(1, 2);
        System.out.println("Edge 0->1: " + g.hasEdge(0, 1) + ", Edge 0->2: " + g.hasEdge(0, 2));
    }
}
