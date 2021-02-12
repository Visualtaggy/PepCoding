import java.util.*;

public class RotateBy90Degree {

    public static void main(String[] args) throws Exception {
        // write your code here

        // 1. You are given a number n, representing the number of rows and number of
        // columns.
        // 2. You are given n*n numbers, representing elements of 2d array a.
        // 3. You are required to rotate the matrix by 90 degree clockwise and then
        // display the contents using display function.
        // *Note - you are required to do it in-place i.e. no extra space should be used
        // to achieve it .*

        Scanner scn = new Scanner(System.in);

        System.out.println("Size of array?");
        int n = scn.nextInt();

        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Elements?");
                a[i][j] = scn.nextInt();
                // System.out.print(a[i][j] + " ");
            }
            // System.out.println();
        }

        // System.out.println("");

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
                // System.out.print(a[i][j] + " ");
            }
            // System.out.println();
        }

        for (int i = 0; i < n; i++) {
            int li = 0;
            int ri = n - 1;

            while (li < ri) {
                int temp = a[i][li];
                a[i][li] = a[i][ri];
                a[i][ri] = temp;

                ri--;
                li++;
            }

        }

        display(a);
        scn.close();
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}