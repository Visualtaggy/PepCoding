import java.util.*;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Size:");
        int n = scn.nextInt();
        int sp = n / 2;
        int spm = 2;

        for (int i = 1; i <= n; i++) {

            // First Half

            for (int j = 1; j <= sp; j++) {
                System.out.print("	");
            }

            if (i <= n / 2) {
                sp--;
            } else {
                sp++;
            }

            System.out.print("*");

            // Second Half

            if (i > 1) {
                for (int j = 1; j <= spm; j++) {
                    System.out.print("	");
                }

                if (i <= n / 2) {
                    spm += 2;
                } else {
                    spm -= 2;
                }

                if (i == n) {
                    System.out.print("");
                } else {
                    System.out.print("*");
                }

            }

            // Return key
            System.out.println("");
        }
        scn.close();
    }
}
