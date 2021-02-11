import java.util.*;

public class AnyBaseToDecimal {

    // 1. You are given a number n.
    // 2. You are given a base b. n is a number on base b.
    // 3. You are required to convert the number n into its corresponding value in
    // decimal number system.

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scn.nextInt();
        System.out.println("Enter the base:");
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
        scn.close();
    }

    public static int getValueIndecimal(int n, int b) {

        int answer = 0;
        int power = 0;

        while (n != 0) {

            int remainder = n % 10;

            remainder = remainder * (int) Math.pow(b, power);

            answer += remainder;

            power++;

            n = n / 10;

        }

        return answer;
    }
}
