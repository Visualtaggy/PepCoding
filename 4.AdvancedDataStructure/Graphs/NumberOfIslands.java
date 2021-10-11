// 1. You are given a 2d array where 0's represent land and 1's represent water. 
//      Assume every cell is linked to it's north, east, west and south cell.
// 2. You are required to find and count the number of islands.

import java.io.*;
import java.util.*;

public class NumberOfIslands {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            String parts = br.readLine();
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
            }
        }

        // write your code here
        boolean visited[][] = new boolean[arr.length][arr[0].length];
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (!visited[i][j] && arr[i][j] == 0) {
                    travel(arr, i, j, visited);
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }

    public static void travel(int arr[][], int i, int j, boolean visited[][]) {

        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == 1 || visited[i][j] == true) {
            return;
        }

        visited[i][j] = true;
        // N
        travel(arr, i - 1, j, visited);
        // E
        travel(arr, i, j + 1, visited);
        // W
        travel(arr, i, j - 1, visited);
        // S
        travel(arr, i + 1, j, visited);

    }

}