import java.util.*;

public class RingRotate {

    // You are given a n*m matrix where n are the number of rows and m are the
    // number of columns. You are also given n*m numbers representing the elements
    // of the matrix.
    // You will be given a ring number 's' representing the ring of the matrix. For
    // details, refer to image.

    // You will be given a number 'r' representing number of rotations in an
    // anti-clockwise manner of the specified ring.
    // You are required to rotate the 's'th ring by 'r' rotations and display the
    // rotated matrix.

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);

        System.out.println("Row?");
        int n = scn.nextInt();
        System.out.println("Colmn?");
        int m = scn.nextInt();

        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Elements?");
                a[i][j] = scn.nextInt();
            }
        }

        System.out.println("Shell?");
        int s = scn.nextInt();
        System.out.println("Rotate?");
        int r = scn.nextInt();

        rotateShell(a, s, r);
        display(a);
        scn.close();
    }

    public static void rotateShell(int[][] a, int s, int r) {
        int[] oneD = fillOneDArrayFromShell(a, s);
        rotate(oneD, r);
        fillShellFromOneD(a, s, oneD);
    }

    public static int[] fillOneDArrayFromShell(int[][] a, int s) {

        int minr = s - 1;
        int minc = s - 1;
        int maxr = a.length - s;
        int maxc = a[0].length - s;

        int size = 2 * (maxr - minr + maxc - minc);

        int[] oneD = new int[size];

        int index = 0;

        // left wall
        for (int i = minr, j = minc; i <= maxr; i++) {
            oneD[index] = a[i][j];
            index++;
        }

        // bottom wall
        for (int i = maxr, j = minc + 1; j <= maxc; j++) {
            oneD[index] = a[i][j];
            index++;
        }
        // right wall
        for (int i = maxr - 1, j = maxc; i >= minr; i--) {
            oneD[index] = a[i][j];
            index++;
        }
        // top wall
        for (int i = minr, j = maxc - 1; j >= minc + 1; j--) { // try without equal?
            oneD[index] = a[i][j];
            index++;
        }

        return oneD;

    }

    public static void fillShellFromOneD(int[][] a, int s, int[] oneD) {

        int minr = s - 1;
        int minc = s - 1;
        int maxr = a.length - s;
        int maxc = a[0].length - s;

        int index = 0;

        // left wall
        for (int i = minr, j = minc; i <= maxr; i++) {
            a[i][j] = oneD[index];
            index++;
        }

        // bottom wall
        for (int i = maxr, j = minc + 1; j <= maxc; j++) {
            a[i][j] = oneD[index];
            index++;
        }
        // right wall
        for (int i = maxr - 1, j = maxc; i >= minr; i--) {
            a[i][j] = oneD[index];
            index++;
        }
        // top wall
        for (int i = minr, j = maxc - 1; j > minc; j--) {
            a[i][j] = oneD[index];
            index++;
        }
    }

    public static void rotate(int[] oneD, int r) {
        r = r % oneD.length;

        if (r < 0) {
            r = r + oneD.length;
        }

        // part 1
        reverse(oneD, 0, oneD.length - r - 1);
        // part 2
        reverse(oneD, oneD.length - r, oneD.length - 1);
        // part 3
        reverse(oneD, 0, oneD.length - 1);
    }

    public static void reverse(int[] oneD, int l, int r) {
        while (l < r) {
            int temp = oneD[l];

            oneD[l] = oneD[r];
            oneD[r] = temp;

            l++;
            r--;
        }
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