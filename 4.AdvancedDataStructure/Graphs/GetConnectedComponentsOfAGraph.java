// 1. You are given a graph.
// 2. You are required to find and print all connected components of the graph.

import java.io.*;
import java.util.*;

public class GetConnectedComponentsOfAGraph {
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

        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();

        // write your code here
        boolean visited[] = new boolean[vtces];

        for (int v = 0; v < vtces; v++) {

            if (!visited[v]) {
                ArrayList<Integer> answer = new ArrayList<>();
                travel(graph, v, answer, visited);
                comps.add(answer);
            }

        }
        
        System.out.println(comps);
    }

    public static void travel(ArrayList<Edge>[] graph, int src, ArrayList<Integer> answer, boolean[] visited) {

        visited[src] = true;
        answer.add(src);

        for (Edge e : graph[src]) {
            if (!visited[e.nbr]) {
                travel(graph, e.nbr, answer, visited);
            }
        }

    }
}