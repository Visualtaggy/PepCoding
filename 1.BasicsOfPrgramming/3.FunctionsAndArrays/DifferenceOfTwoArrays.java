import java.util.*;

public class DifferenceOfTwoArrays {
    public static void main(String[] args) {

        // 1. You are given a number n1, representing the size of array a1.
        // 2. You are given n1 numbers, representing elements of array a1.
        // 3. You are given a number n2, representing the size of array a2.
        // 4. You are given n2 numbers, representing elements of array a2.
        // 5. The two arrays represent digits of two numbers.
        // 6. You are required to find the difference of two numbers represented by two
        // arrays and print the arrays. a2 - a1

        // Assumption - number represented by a2 is greater.
        Scanner scn = new Scanner(System.in);
        // First Array
        System.out.println("Enter the size of the first array");
        int n1 = scn.nextInt();

        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            System.out.println("Enter the elements");
            a1[i] = scn.nextInt();
        }

        // Second Array
        System.out.println("Enter the size of the second array");
        int n2 = scn.nextInt();

        int[] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            System.out.println("Enter the elements");
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

            int digit = 0;
            int dummy = i >= 0 ? a1[i] : 0;

            if ((a2[j] + carry) >= dummy) {
                digit = (a2[j] + carry) - dummy;
                carry = 0;
            } else {
                digit = (a2[j] + carry + 10) - dummy;
                carry = -1;
            }

            sum[k] = digit;

            i--;
            j--;
            k--;

        }
        int index = 0;
        while (index < sum.length) {
            if (sum[index] == 0) {
                index++;
            } else {
                break;
            }
        }

        while (index < sum.length) {
            System.out.println(sum[index]);
            index++;
        }
    }
}
