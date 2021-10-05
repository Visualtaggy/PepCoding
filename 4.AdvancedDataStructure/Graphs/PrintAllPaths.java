// 1. You are given a graph, a source vertex and a destination vertex.
// 2. You are required to find and print all paths between source and destination. Print 
//      them in lexicographical order.

//     E.g. Check the following paths
//              012546
//              01256
//              032546
//              03256

//     The lexicographically smaller path is printed first.

import java.io.*;
import java.util.*;

public class PrintAllPaths {
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        int src = Integer.parseInt(br.readLine());
        int dest = Integer.parseInt(br.readLine());

        // write all your codes here
        boolean[] visited = new boolean[vtces];
        print_all_paths(graph, src, dest, visited, src + "");
    }

    public static void print_all_paths(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited, String path) {
        if (src == dest) {
            System.out.println(path);
            return;
        }

        // setting current block to visited
        visited[src] = true;

        for (Edge edge : graph[src]) {
            if (!visited[edge.nbr]) {
                print_all_paths(graph, edge.nbr, dest, visited, path + edge.nbr);
            }
        }
        // for other paths using same way(half of it)
        visited[src] = false;
    }
}
