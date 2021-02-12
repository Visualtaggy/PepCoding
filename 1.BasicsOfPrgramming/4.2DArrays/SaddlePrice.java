import java.util.*;

public class SaddlePrice {

    // 1. You are given a square matrix of size 'n'. You are given n*n elements of
    // the square matrix.
    // 2. You are required to find the saddle price of the given matrix and print
    // the saddle price.
    // 3. The saddle price is defined as the least price in the row but the maximum
    // price in the column of the matrix

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        System.out.println("Size?");
        int n = scn.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Elements?");
                arr[i][j] = scn.nextInt();
                // System.out.print(arr[i][j] + " ");
            }
            // System.out.println();
        }
        scn.close();

        for (int i = 0; i < arr.length; i++) {

            int champ = 0;
            for (int j = 1; j < arr[0].length; j++) {

                if (arr[i][j] < arr[i][champ]) {
                    champ = j;
                }
            }
            boolean flag = true;

            for (int k = 0; k < arr.length; k++) {

                if (arr[k][champ] > arr[i][champ]) {
                    flag = false;
                    break;
                }
            }

            if (flag == true) {
                System.out.println(arr[i][champ]);
                return;
            }
        }

        System.out.println("Invalid input");

    }

}