import java.util.*;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("size:");
        int n = scn.nextInt();

        int sp = 1;
        int spm = n - 1;

        for (int i = 1; i <= n; i++) {

            // Printing intial space
            if (i > 1) {
                for (int j = 1; j < sp; j++) {
                    System.out.print("	");
                }
            }

            // Controling the spaces
            if (i <= n / 2) {
                sp++;
            } else {
                sp--;
            }

            // Printing Star
            System.out.print("*");

            for (int j = 1; j <= spm; j++) {
                System.out.print("	");
            }

            if (i <= n / 2) {
                spm -= 2;
            } else {
                spm += 2;
            }

            if (i == (n / 2) + 1) {
                System.out.print("");
            } else {
                System.out.print("*");

            }

            // hitting return key
            System.out.println("");
        }
        scn.close();
    }
}
