// // 1. You are given a number n (representing the number of students). Each student will have an id 
// //      from 0 to n - 1.
// // 2. You are given a number k (representing the number of clubs)
// // 3. In the next k lines, two numbers are given separated by a space. The numbers are ids of 
// //      students belonging to same club.
// // 4. You have to find in how many ways can we select a pair of students such that both students are 
//      from different clubs.

import java.io.*;
import java.util.*;

public class PerfectFriends {

    public static class Edge {
        int v;
        int n;

        Edge(int v, int n) {
            this.v = v;
            this.n = n;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        // write your code here
        ArrayList<Edge>[] graph = new ArrayList[n];

        for (int v = 0; v < n; v++) {
            graph[v] = new ArrayList<>();
        }

        // taking pair input
        for (int e = 0; e < k; e++) {
            String user_input = br.readLine();
            String[] split_input = user_input.split(" ");

            int val1 = Integer.parseInt(split_input[0]);
            int val2 = Integer.parseInt(split_input[1]);

            graph[val1].add(new Edge(val1, val2));
            graph[val1].add(new Edge(val2, val1));

        }

        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                ArrayList<Integer> answer = new ArrayList<>();
                travel(graph, i, answer, visited);
                comps.add(answer);
            }
        }
        int total = 0;
        for (int j = 0; j < comps.size(); j++) {
            for (int l = j + 1; l < comps.size(); l++) {
                int pair = comps.get(j).size() * comps.get(l).size();
                total += pair;
            }
        }

        System.out.println(total);
    }

    public static void travel(ArrayList<Edge>[] graph, int src, ArrayList<Integer> answer, boolean[] visited) {
        visited[src] = true;
        answer.add(src);

        for (Edge e : graph[src]) {
            if (!visited[e.n]) {
                travel(graph, e.n, answer, visited);
            }
        }
    }

}