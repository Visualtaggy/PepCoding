import java.util.*;

public class CountDigitsInANumber {
    public static void main(String[] args) {
        // 1. You've to count the number of digits in a number.
        // 2. Take as input "n", the number for which the digits has to be counted.
        // 3. Print the digits in that number.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        int count = 0;

        while (n != 0) {
            n = n / 10;
            count++;
        }

        System.out.println(count);
        scanner.close();

    }
}
