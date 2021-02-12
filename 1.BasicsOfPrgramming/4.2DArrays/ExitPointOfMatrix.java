import java.util.*;

public class ExitPointOfMatrix {

    public static void main(String[] args) throws Exception {
        // write your code here

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

        Scanner scn = new Scanner(System.in);
        System.out.println("Row?");
        int n = scn.nextInt();
        System.out.println("Colmn?");
        int m = scn.nextInt();

        int a[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("element?");
                a[i][j] = scn.nextInt();
                // System.out.print(a[i][j]);
            }
            // System.out.println();
        }

        // Directions
        int dir = 0;
        int i = 0;
        int j = 0;

        while (true) {

            dir = (dir + a[i][j]) % 4;

            if (dir == 0) {
                j++;
            } else if (dir == 1) {
                i++;
            } else if (dir == 2) {
                j--;
            } else {
                i--;
            }

            if (i < 0) {
                i++;
                break;
            } else if (j < 0) {
                j++;
                break;
            } else if (i > a.length - 1) {
                i--;
                break;
            } else if (j > a[0].length - 1) {
                j--;
                break;
            }

        }

        System.out.println(i);
        System.out.println(j);
        scn.close();
    }

}