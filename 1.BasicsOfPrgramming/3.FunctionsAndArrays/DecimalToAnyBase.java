import java.util.*;

public class DecimalToAnyBase {
    public static void main(String[] args) {

        // 1. You are given a decimal number n.
        // 2. You are given a base b.
        // 3. You are required to convert the number n into its corresponding value in
        // base b.

        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the decimal number");
        int n = scn.nextInt();
        System.out.println("Please enter the base");
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
        scn.close();
    }

    public static int getValueInBase(int n, int b) {
        int answer = 0;
        int power = 1;

        while (n != 0) {

            int lastDigit = n % b;

            answer += lastDigit * power;
            power = power * 10;

            n = n / b;

        }

        return answer;
    }
}
