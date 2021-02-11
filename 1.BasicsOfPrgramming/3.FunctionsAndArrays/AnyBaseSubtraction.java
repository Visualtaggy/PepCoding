import java.util.*;

public class AnyBaseSubtraction {
    public static void main(String[] args) {

        // 1. You are given a base b.
        // 2. You are given two numbers n1 and n2 of base b.
        // 3. You are required to subtract n1 from n2 and print the value.

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the base");
        int b = scn.nextInt();
        System.out.println("Enter the the first number");
        int n1 = scn.nextInt();
        System.out.println("Enter the second number");
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
        scn.close();
    }

    public static int getDifference(int b, int n1, int n2) {
        // write your code here

        int answer = 0;
        int carry = 0;
        int power = 0;

        while (n2 != 0) {

            int d1 = n1 % 10;
            int d2 = n2 % 10;

            n1 = n1 / 10;
            n2 = n2 / 10;

            int digit = 0;
            d2 = d2 + carry;

            if (d2 >= d1) {
                digit = d2 - d1;
                carry = 0;
            } else {
                carry = -1;
                digit = (d2 + b) - d1;
            }

            answer += digit * Math.pow(10, power);
            power++;

        }

        return answer;
    }
}
