import java.util.Scanner;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        // 1. You are given a base b.
        // 2. You are given two numbers n1 and n2 of base b.
        // 3. You are required to multiply n1 and n2 and print the value.

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the base");
        int b = scn.nextInt();
        System.out.println("Enter the first number");
        int n1 = scn.nextInt();
        System.out.println("Enter the second number");
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
        scn.close();
    }

    public static int getProduct(int b, int n1, int n2) {
        int answer = 0;
        int power = 1;

        while (n2 != 0) {

            int d2 = n2 % 10;
            n2 = n2 / 10;

            int multi = getProductWithSingleDigit(d2, n1, b);

            answer = getSum(b, answer, multi * power);
            power = power * 10;

        }

        return answer;
    }

    public static int getProductWithSingleDigit(int d2, int n1, int b) {
        int carry = 0;
        int answer = 0;
        int power = 1;

        while (n1 != 0 || carry != 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;

            int digit = d1 * d2 + carry;

            carry = digit / b;

            digit = digit % b;

            answer += digit * power;
            power = power * 10;
        }
        return answer;

    }

    public static int getSum(int b, int n1, int n2) {
        int answer = 0;
        int power = 0;
        int carry = 0;
        while (n1 > 0 || carry > 0 || n2 > 0) {

            int digit1 = n1 % 10;
            int digit2 = n2 % 10;

            n1 = n1 / 10;
            n2 = n2 / 10;

            int sum = digit1 + digit2 + carry;

            carry = sum / b;

            sum = sum % b;

            answer += sum * (int) Math.pow(10, power);
            power++;
        }
        return answer;
    }
}
