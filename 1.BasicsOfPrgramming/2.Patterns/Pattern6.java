import java.util.*;

public class Pattern6 {
    public static void main(String[] args) {

        // 1. You are given a number n.
        // 2. You've to create a pattern of * and separated by tab as shown in output
        // format.
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size: ");

        int n = scn.nextInt();

        int st = n / 2 + 1;
        int sp = 1;

        for (int i = 1; i <= n; i++) {

            // Initial star
            for (int j = 1; j <= st; j++) {
                System.out.print("*	");
            }

            // Space
            for (int k = 1; k <= sp; k++) {
                System.out.print("	");
            }

            // More stars

            for (int l = 1; l <= st; l++) {
                System.out.print("*	");
            }

            if (i <= n / 2) {
                st--;
                sp += 2;
            }

            else {
                st++;
                sp -= 2;
            }

            System.out.println("");
        }
        scn.close();
    }
}
