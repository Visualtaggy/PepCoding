import java.util.*;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // write your code here
        System.out.println("size:");
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {

                System.out.print(number + "	");

                int ijp = number * (i - j) / (j + 1);
                number = ijp;
            }
            System.out.println("");
        }
        scn.close();
    }
}
