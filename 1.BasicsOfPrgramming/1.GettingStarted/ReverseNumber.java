import java.util.*;

public abstract class ReverseNumber {
    public static void main(String[] args) {

        // 1. You've to display the digits of a number in reverse.
        // 2. Take as input "n", the number for which digits have to be display in
        // reverse.
        // 3. Print the digits of the number line-wise, but in reverse order.

        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter the number: ");
        int n = scn.nextInt();

        while (n != 0) {
            int digit = n % 10;

            System.out.println(digit);

            n = n / 10;
        }
        scn.close();
    }
}
