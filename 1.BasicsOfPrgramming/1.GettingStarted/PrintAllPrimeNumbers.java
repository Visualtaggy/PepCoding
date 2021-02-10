import java.util.*;

public class PrintAllPrimeNumbers {
    public static void main(String[] args) {
        // 1. You've to print all prime numbers between a range.
        // 2. Take as input "low", the lower limit of range.
        // 3. Take as input "high", the higher limit of range.
        // 4. For the range print all the primes numbers between low and high (both
        // included).
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the low range: ");
        int low = scn.nextInt();
        System.out.print("Enter the high range: ");
        int high = scn.nextInt();

        // Generating all possible values for n
        for (int value = low; value <= high; value++) {
            int counter = 0;

            // Looping till value to check if it can be divided
            for (int div = 2; div * div <= value; div++) {
                if (value % div == 0) {
                    counter++;
                    break;
                }
            }

            // checking counters value
            if (counter == 0) {
                System.out.println(value);
            }
        }
        scn.close();
    }
}
