import java.util.*;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        // 1. You are given a number n, representing the size of array a.
        // 2. You are given n numbers, representing elements of array a.
        // 3. You are required to print a bar chart representing value of arr a.

        Scanner scn = new Scanner(System.in);

        // First Array
        System.out.println("Enter the size of the first array");
        int n1 = scn.nextInt();

        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            System.out.println("Enter the elements:");
            a1[i] = scn.nextInt();
        }

        // Second Array
        System.out.println("Enter the size of second array:");
        int n2 = scn.nextInt();

        int[] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            System.out.println("Enter the elements:");
            a2[i] = scn.nextInt();
        }
        scn.close();
        // Third array

        int[] sum = new int[n1 > n2 ? n1 : n2];

        int carry = 0;
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = sum.length - 1;

        while (k >= 0) {

            int digit = carry;

            if (i >= 0) {
                digit += a1[i];
            }

            if (j >= 0) {
                digit += a2[j];
            }

            carry = digit / 10;

            digit = digit % 10;

            sum[k] += digit;
            i--;
            j--;
            k--;
        }
        if (carry != 0) {
            System.out.println(carry);
        }

        for (int value : sum) {
            System.out.println(value);
        }
    }
}
