import java.util.*;

public class Pattern3 {
    public static void main(String[] args) {
        // 1. You are given a number n.
        // 2. You've to create a pattern of * and separated by tab as shown in output
        // format.

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = scn.nextInt();

        int space = n - 1;
        int star = 1;

        for (int i = 1; i <= n; i++) {

            // space
            for (int j = 1; j <= space; j++) {
                System.out.print("	");

            }

            // star
            for (int k = 1; k <= star; k++) {
                System.out.print("*	");
            }

            System.out.println();
            star++;
            space--;

        }
        scn.close();
    }
}
