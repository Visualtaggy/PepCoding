import java.util.*;

public class IntroductionToGraphs {

    // Custom class to take data of edge inside arraylist
    public static class Edge {
        int source;
        int neighbour;
        int weight;

        Edge(int source, int neighbour, int weight) {
            this.source = source;
            this.neighbour = neighbour;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {

        // Number of vertices
        int vertices = 5;
        // Creating arraylist with arraylists of vertices
        ArrayList<Edge>[] graph = new ArrayList[vertices];

        for (int i = 0; i < vertices; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 3, 40));
        graph[0].add(new Edge(0, 1, 10));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 2, 10));

        graph[2].add(new Edge(2, 3, 10));
        graph[2].add(new Edge(2, 1, 10));

        graph[3].add(new Edge(3, 0, 40));
        graph[3].add(new Edge(3, 2, 10));
        graph[3].add(new Edge(3, 4, 2));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 4, 3));
        graph[4].add(new Edge(4, 6, 3));
    }

}
