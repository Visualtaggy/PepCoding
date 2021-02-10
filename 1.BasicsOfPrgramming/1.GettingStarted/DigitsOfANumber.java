import java.util.*;

public class DigitsOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // 1. You've to display the digits of a number.
        // 2. Take as input "n", the number for which digits have to be displayed.
        // 3. Print the digits of the number line-wise.

        System.out.println("Please enter the number: ");
        int n = scn.nextInt();

        int counter = 0;
        int temp = n;

        // System.out.println(temp);
        while (temp != 0) {

            temp = temp / 10;
            counter++;
        }

        int magic = (int) Math.pow(10, counter - 1);

        while (magic != 0) {

            int digit = n / magic;
            System.out.println(digit);

            // making small;
            n = n % magic;
            magic = magic / 10;

        }
        scn.close();
    }
}
