import java.util.*;

public class Pattern2 {
    public static void main(String[] args) {

        // 1. You are given a number n.
        // 2. You've to create a pattern of * and separated by tab as shown in output
        // format.

        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter this size: ");
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*	");
            }
            System.out.println("");
        }

        scn.close();

    }
}
