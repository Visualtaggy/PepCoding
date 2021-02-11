import java.util.*;

public class TwoDArraysDemo {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] numbers = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                numbers[i][j] = scn.nextInt();
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println("");

        }
        scn.close();
    }

}