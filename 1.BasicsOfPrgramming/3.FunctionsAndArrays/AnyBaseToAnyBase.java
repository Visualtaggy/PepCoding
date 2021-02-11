import java.util.*;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        // 1. You are given a number n.
        // 2. You are given a base b1. n is a number on base b.
        // 3. You are given another base b2.
        // 4. You are required to convert the number n of base b1 to a number in base b2.

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scn.nextInt();
        System.out.println("Enter the base");
        int sourceBase = scn.nextInt();
        System.out.println("Enter the second base:");
        int destBase = scn.nextInt();
        int decimal = toDecimal(n, sourceBase);
        int display = anyBase(decimal, destBase);
        System.out.println(display);
        scn.close();
    }

    public static int toDecimal(int n, int b) {
        int answer = 0;
        int power = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            lastDigit = lastDigit * (int) Math.pow(b, power);
            power++;
            answer += lastDigit;
            n = n / 10;
        }
        return answer;
    }

    public static int anyBase(int n, int b2) {
        int answer = 0;
        int power = 1;
        while (n != 0) {
            int rm = n % b2;
            rm = rm * power;
            power *= 10;
            answer += rm;
            n = n / b2;
        }
        return answer;
    }
}
