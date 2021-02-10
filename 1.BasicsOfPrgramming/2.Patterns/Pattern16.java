import java.util.*;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Size:");
        int n = scn.nextInt();

        int st = 1;
        int sp = (2 * n) - 3;

        for (int i = 1; i <= n; i++) {

            int value = 1;

            // Starssss
            for (int j = 1; j <= st; j++) {
                System.out.print(value + "	");
                value++;
            }

            // Space
            for (int j = 1; j <= sp; j++) {
                System.out.print("	");
            }

            if (i == n) {
                st--;
                value--;
            }
            // Stars
            for (int j = 1; j <= st; j++) {
                value--;
                System.out.print(value + "	");
            }

            st++;
            sp -= 2;

            System.out.println("");

        }
        scn.close();
    }
}
