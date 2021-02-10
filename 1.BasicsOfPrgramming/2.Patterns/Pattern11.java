import java.util.*;

public class Pattern11 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("size");
        int n = scn.nextInt();
        int number = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(number + "	");
                number++;
            }

            System.out.println("");
        }
        scn.close();
    }
}
