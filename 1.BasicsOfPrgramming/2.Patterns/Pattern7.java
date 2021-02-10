import java.util.*;

public class Pattern7 {
    public static void main(String[] args) {
        // 1. You are given a number n.
        // 2. You've to create a pattern of * and separated by tab as shown in output
        // format.
        Scanner scn = new Scanner(System.in);
        System.out.println("Size: ");
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i > 1) {
                for (int j = 1; j < i; j++) {
                    System.out.print("	");
                }
            }

            System.out.print("*	");

            // Pressing return key
            System.out.println("");
        }

        scn.close();

    }
}
