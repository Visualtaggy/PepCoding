import java.util.*;

public class Pattern4 {
    public static void main(String[] args) {

        // 1. You are given a number n.
        // 2. You've to create a pattern of * and separated by tab as shown in output
        // format.
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i > 1) {
                for (int k = 1; k < i; k++) {
                    System.out.print("	");
                }
            }

            for (int j = n; j >= i; j--) {
                System.out.print("*	");
            }

            System.out.println("");

        }
        scn.close();
    }
}
