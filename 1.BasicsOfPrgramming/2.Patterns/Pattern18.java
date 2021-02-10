import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        System.out.println("size");
        int n = scn.nextInt();

        int star = n;
        int space = 0;

        for (int i = 1; i <= n; i++) {

            // Initial space will be 0
            if (i > 1) {
                for (int j = 1; j <= space; j++) {
                    System.out.print("	");
                }
            }

            // Printing stars
            for (int j = 1; j <= star; j++) {
                if (i > 1 && i <= n / 2 && j > 1 && j < star) {
                    System.out.print("	");
                }

                else {
                    System.out.print("*	");
                }
            }

            if (i <= n / 2) {
                star -= 2;
                space++;
            } else {
                star += 2;
                space--;
            }
            System.out.println("");

        }
        scn.close();
    }
}
