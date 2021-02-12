import java.util.*;

public class MultiplicationMatrix {

    // 1. You are given a number n1, representing the number of rows of 1st matrix.
    // 2. You are given a number m1, representing the number of columns of 1st
    // matrix.
    // 3. You are given n1*m1 numbers, representing elements of 2d array a1.
    // 4. You are given a number n2, representing the number of rows of 2nd matrix.
    // 5. You are given a number m2, representing the number of columns of 2nd
    // matrix.
    // 6. You are given n2*m2 numbers, representing elements of 2d array a2.
    // 7. If the two arrays representing two matrices of dimensions n1 * m1 and n2 *
    // m2 can be multiplied, display the contents of prd array as specified in
    // output Format.
    // 8. If the two arrays can't be multiplied, print "Invalid input".
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Rows of matrix 1 ?");
        int r1 = scn.nextInt();
        System.out.println("Colmn of matrix 1 ?");
        int c1 = scn.nextInt();

        int[][] one = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.println("Elements");
                one[i][j] = scn.nextInt();
            }

        }

        System.out.println("Rows of 2nd matrix?");
        int r2 = scn.nextInt();
        System.out.println("Colmn of 2nd matrix?");
        int c2 = scn.nextInt();

        int[][] two = new int[r2][c2];

        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.println("Elements");
                two[i][j] = scn.nextInt();
            }
        }

        if (c1 != r2) {
            System.out.println("Invalid input");
        }

        else {

            int[][] product = new int[r1][c2];

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {

                    for (int k = 0; k < c1; k++) {

                        product[i][j] += one[i][k] * two[k][j];

                    }
                }
            }

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(product[i][j] + " ");
                }
                System.out.println();
            }

        }
        scn.close();
    }
}
