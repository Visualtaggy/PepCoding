import java.util.*;

public class AnyBaseAddition {
    public static void main(String[] args) {
        // 1. You are given a base b.
        // 2. You are given two numbers n1 and n2 of base b.
        // 3. You are required to add the two numbes and print their value in base b.
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the base");
        int b = scn.nextInt();
        System.out.println("Enter the first number");
        int n1 = scn.nextInt();
        System.out.println("Enter the second number");
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
        scn.close();
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
