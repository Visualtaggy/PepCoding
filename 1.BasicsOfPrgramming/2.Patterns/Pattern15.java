import java.util.*;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Size:");
        int n = scn.nextInt();
        int sp = n / 2;
        int st = 1;
        int counter = 1;

        for (int i = 1; i <= n; i++) {

            // Printing Spaces
            for (int j = 1; j <= sp; j++) {
                System.out.print("	");
            }

            if (i <= n / 2) {
                sp--;
            } else {
                sp++;
            }

            // Printing Stars

            int nCounter = counter;

            for (int j = 1; j <= st; j++) {

                System.out.print(nCounter + "	");

                if (j <= st / 2) {
                    nCounter++;
                } else {
                    nCounter--;
                }
            }

            if (i <= n / 2) {
                st += 2;
                counter += 1;
            } else {
                st -= 2;
                counter -= 1;
            }

            System.out.println("");
        }

        scn.close();
    }
}
