import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {

        // 1. You are given a number n.
        // 2. You are given a digit d.
        // 3. You are required to calculate the frequency of digit d in number n.
        // write code here
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scn.nextInt();
        System.out.println("Enter the digit to be found");
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
        scn.close();
    }

    public static int getDigitFrequency(int n, int d) {
        // write code here
        int counter = 0;
        while (n != 0) {

            int number = n % 10;

            if (number == d) {
                counter++;
            }

            n = n / 10;

        }
        return counter;
    }
}