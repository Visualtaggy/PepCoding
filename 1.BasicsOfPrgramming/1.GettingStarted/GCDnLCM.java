import java.util.*;

public class GCDnLCM {
    public static void main(String[] args) {
        // write your code here

        // 1. You are required to print the Greatest Common Divisor (GCD) of two
        // numbers.
        // 2. You are also required to print the Lowest Common Multiple (LCM) of the
        // same numbers.
        // 3. Take input "num1" and "num2" as the two numbers.
        // 4. Print their GCD and LCM.

        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter the first number:");
        int num1 = scn.nextInt();

        System.out.println("Please enter the second number:");
        int num2 = scn.nextInt();

        int tmp1 = num1;
        int tmp2 = num2;

        while (tmp1 % tmp2 != 0) {
            int rem = tmp1 % tmp2;
            tmp1 = tmp2;
            tmp2 = rem;
        }

        System.out.println(tmp2);

        int lcm = (num1 * num2) / tmp2;
        System.out.println(lcm);
        scn.close();
    }
}
