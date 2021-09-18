
// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are given a number k.
// 4. You are required to find and print the k largest elements of array in increasing order.
import java.io.*;
import java.util.*;

public class KLargestElements {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int k = Integer.parseInt(br.readLine());
        // write your code here

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {

            // Add whoever you want
            if (i < k) {
                pq.add(arr[i]);
            }

            // trials begin here

            else {
                if (arr[i] > pq.peek()) {
                    pq.remove();
                    pq.add(arr[i]);
                }

            }
        }

        while (pq.size() > 0) {
            System.out.println(pq.peek());
            pq.remove();

        }

    }

}