import java.util.*;

public class SearchInSorted2DArray {
    // 1. You are given a number n, representing the number of rows and columns of a
    // square matrix.
    // 2. You are given n * n numbers, representing elements of 2d array a.
    // Note - Each row and column is sorted in increasing order.
    // 3. You are given a number x.
    // 4. You are required to find x in the matrix and print it's location int (row,
    // col) format as discussed in output format below.
    // 5. In case element is not found, print "Not Found".
    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);
        System.out.println("Size?");
        int n = scn.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("elements?");
                arr[i][j] = scn.nextInt();
                // System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println("Find which element?");
        int x = scn.nextInt();
        scn.close();
        // Binary modified
        int i = 0;
        int j = arr[0].length - 1;

        while (i < arr.length && j > 0) {

            if (x == arr[i][j]) {
                System.out.println(i);
                System.out.println(j);
                return;
            }

            if (x > arr[i][j]) {
                i++;
            }

            if (x < arr[i][j]) {
                j--;
            }

        }

        System.out.println("Not Found");

    }

}