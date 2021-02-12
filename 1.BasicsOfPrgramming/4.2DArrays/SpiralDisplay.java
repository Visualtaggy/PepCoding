import java.util.*;

public class SpiralDisplay {

    public static void main(String[] args) throws Exception {
        // write your code here
        // 1. You are given a number n, representing the number of rows.
        // 2. You are given a number m, representing the number of columns.
        // 3. You are given n*m numbers, representing elements of 2d array a.
        // 4. You are required to traverse and print the contents of the 2d array in
        // form of a spiral.
        // Note - Please check the sample output for details.

        Scanner scn = new Scanner(System.in);
        System.out.println("Row?");
        int n = scn.nextInt();
        System.out.println("Colmn?");
        int m = scn.nextInt();

        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("element?");
                a[i][j] = scn.nextInt();
                // System.out.print(a[i][j] + " ");
            }
            // System.out.println();
        }

        // System.out.println("");

        int minr = 0;
        int minc = 0;
        int maxr = a.length - 1;
        int maxc = a[0].length - 1;

        int total = n * m;
        int counter = 0;

        while (counter < total) {
            // Left wall
            for (int i = minr, j = minc; i <= maxr && counter < total; i++) {
                System.out.println(a[i][j]);
                counter++;
            }
            minc++;

            // Bottom wall
            for (int i = minc; i <= maxc && counter < total; i++) {
                System.out.println(a[maxr][i]);
                counter++;
            }
            maxr--;

            // Right wall
            for (int i = maxr; i >= minr && counter < total; i--) {
                System.out.println(a[i][maxc]);
                counter++;
            }
            maxc--;

            // Top wall
            for (int i = maxc; i >= minc && counter < total; i--) {
                System.out.println(a[minr][i]);
                counter++;
            }
            minr++;
        }
        scn.close();

    }

}