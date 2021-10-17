import java.io.*;
import java.util.*;

public class BreadthFirstTraversal {
    static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
        }
    }

    public static class Pair {
        int v;
        String psf;

        Pair(int v, String psf) {
            this.v = v;
            this.psf = psf;
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
            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }

        int src = Integer.parseInt(br.readLine());

        // write your code here
        ArrayDeque<Pair> custom_queue = new ArrayDeque<>();
        custom_queue.add(new Pair(src, src + ""));

        boolean[] visited = new boolean[vtces];

        while (custom_queue.size() > 0) {
            Pair removed_element = custom_queue.removeFirst();

            if (visited[removed_element.v]) {
                continue;
            }

            visited[removed_element.v] = true;
            System.out.println(removed_element.v + "@" + removed_element.psf);

            for (Edge e : graph[removed_element.v]) {
                if (!visited[e.nbr]) {
                    custom_queue.add(new Pair(e.nbr, removed_element.psf + e.nbr));
                }
            }
        }

    }
}