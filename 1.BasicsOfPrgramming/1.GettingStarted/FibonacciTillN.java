import java.util.*;

public class FibonacciTillN {
    public static void main(String[] args) {
        // 1. You've to print first n fibonacci numbers.
        // 2. Take as input "n", the count of fibonacci numbers to print.
        // 3. Print first n fibonacci numbers.
        Scanner scn = new Scanner(System.in);

        System.out.print("Fibonacci till ? ");
        int n = scn.nextInt();

        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i < n; i++) {

            int c = a + b;
            a = b;
            b = c;
            System.out.println(c);

        }
        scn.close();
    }
}
