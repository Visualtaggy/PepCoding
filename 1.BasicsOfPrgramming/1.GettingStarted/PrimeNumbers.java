import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        // 1. You've to check whether a given number is prime or not.
        // 2. Take a number "t" as input representing count of input numbers to be
        // tested.
        // 3. Take a number "n" as input "t" number of times.
        // 4. For each input value of n, print "prime" if the number is prime and "not
        // prime" otherwise.

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of prime numbers you want to check: ");
        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {

            // Taking user input
            System.out.println("Please enter the number you want to check");
            int n = scn.nextInt();

            // Variable to check how many times number was divided
            int counter = 0;
            // loop to check for prime
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }

        }
        scn.close();
    }
}
