import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        System.out.println("size:");
        // write ur code here

        int n = scn.nextInt();
        int space = n / 2;
        int star = 1;

        for (int i = 1; i <= n; i++) {

            // Printing spaces
            for (int j = 1; j <= space; j++) {

                if (i == n / 2 + 1) {
                    System.out.print("*	");
                } else {
                    System.out.print("	");
                }
            }

            // Printing Stars
            for (int j = 1; j <= star; j++) {
                System.out.print("*	");
            }

            // Control Block
            if (i <= n / 2) {
                star++;
            } else {
                star--;
            }

            System.out.println("");
        }
        scn.close();
    }
}
