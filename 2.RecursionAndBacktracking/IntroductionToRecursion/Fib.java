import java.util.Scanner;

/**
 * Fib
 */
public class Fib {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Numberic value of n ");
        int n = scn.nextInt();

        System.out.print("Nth Fibo number is: ");
        System.out.println(fibo(n));
        scn.close();
    }

    public static int fibo(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        }
        int a = fibo(n - 1);
        int b = fibo(n - 2);

        int total = a + b;
        return total;
    }
}