


    class GraphMatrix {
        private int[][] adjacencyMatrix;
        private int vertices;

        // Constructor
        public GraphMatrix(int vertices) {
            this.vertices = vertices;
            adjacencyMatrix = new int[vertices][vertices];
        }

        // Add Edge
        public void addEdge(int src, int dest) {
            adjacencyMatrix[src][dest] = 1;
            adjacencyMatrix[dest][src] = 1; // For undirected graph
        }

        // Print Graph
        public void printGraph() {
            System.out.println("Adjacency Matrix:");
            for (int i = 0; i < vertices; i++) {
                for (int j = 0; j < vertices; j++) {
                    System.out.print(adjacencyMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            GraphMatrix graph = new GraphMatrix(4);
            graph.addEdge(0, 1);
            graph.addEdge(0, 2);
            graph.addEdge(1, 2);
            graph.addEdge(2, 3);
            graph.printGraph();
        }
    }


