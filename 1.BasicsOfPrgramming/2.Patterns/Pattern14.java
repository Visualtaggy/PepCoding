import java.util.*;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("size:");
        int n = scn.nextInt();
        int value = n;

        for (int i = 1; i <= 10; i++) {

            System.out.println(n + " * " + i + " = " + value);

            value += n;
        }
        scn.close();
    }
}
