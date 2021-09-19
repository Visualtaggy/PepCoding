// 1. You are given a list of lists, where each list is sorted.
// 2. You are required to complete the body of mergeKSortedLists function. The function is expected to merge k sorted lists to create one sorted list.

import java.io.*;
import java.util.*;

public class MergeKSortedLists {

    // making custom class to store the data
    public static class Pair implements Comparable<Pair> {
        int list_index;
        int data_index;
        int data_value;

        Pair(int list_index, int data_index, int data_value) {
            this.list_index = list_index;
            this.data_index = data_index;
            this.data_value = data_value;
        }

        public int compareTo(Pair o) {
            return this.data_value - o.data_value;
        }
    }

    public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists) {
        ArrayList<Integer> rv = new ArrayList<>();

        // write your code here
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // looping over K number of lists
        for (int i = 0; i < lists.size(); i++) {
            Pair p = new Pair(i, 0, lists.get(i).get(0));
            pq.add(p);
        }

        // removing and adding it to our answer arraylsit
        while (pq.size() > 0) {
            Pair p = pq.remove();
            rv.add(p.data_value);

            // increasing index
            p.data_index++;

            // moving ahead if list hasn't run out of elements
            if (p.data_index < lists.get(p.list_index).size()) {

                p.data_value = lists.get(p.list_index).get(p.data_index);
                pq.add(p);

            }

        }

        return rv;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ArrayList<Integer> list = new ArrayList<>();

            int n = Integer.parseInt(br.readLine());
            String[] elements = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                list.add(Integer.parseInt(elements[j]));
            }

            lists.add(list);
        }

        ArrayList<Integer> mlist = mergeKSortedLists(lists);
        for (int val : mlist) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

}