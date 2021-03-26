// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers, representing elements of 2d array a. The
// numbers can be 1 or 0 only.
// 4. You are standing in the top-left corner and have to reach the bottom-right
// corner.
// Only four moves are allowed 't' (1-step up), 'l' (1-step left), 'd' (1-step
// down) 'r' (1-step right). You can only move to cells which have 0 value in
// them. You can't move out of the boundaries or in the cells which have value 1
// in them (1 means obstacle)
// 5. Complete the body of floodfill function - without changing signature - to
// print all paths that can be used to move from top-left to bottom-right.

// Note1 -> Please check the sample input and output for details
// Note2 -> If all four moves are available make moves in the order 't', 'l',
// 'd' and 'r'

import java.util.*;

public class FloodFill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = scn.nextInt();
        System.out.println("Enter the number of colls: ");
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter the elements: ");
                arr[i][j] = scn.nextInt();
            }
        }

        boolean[][] visitTracker = new boolean[n][m];

        printFloodFill(0, 0, n, m, arr, "", visitTracker);
        scn.close();
    }

    public static void printFloodFill(int sr, int sc, int dr, int dc, int[][] arr, String answer,
            boolean[][] visitTrack) {

        if (sr < 0 || sc < 0 || sr >= dr || sc >= dc || arr[sr][sc] == 1 || visitTrack[sr][sc] == true) {
            return;
        }

        if (sr == dr - 1 && sc == dc - 1) {
            System.out.println(answer);
            return;
        }

        visitTrack[sr][sc] = true;
        // Top
        printFloodFill(sr - 1, sc, dr, dc, arr, answer + "t", visitTrack);
        // Left
        printFloodFill(sr, sc - 1, dr, dc, arr, answer + "l", visitTrack);
        // Down
        printFloodFill(sr + 1, sc, dr, dc, arr, answer + "d", visitTrack);
        // Right
        printFloodFill(sr, sc + 1, dr, dc, arr, answer + "r", visitTrack);

        visitTrack[sr][sc] = false;

    }
}