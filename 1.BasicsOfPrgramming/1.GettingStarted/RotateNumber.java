import java.util.*;

public class RotateNumber {
    public static void main(String[] args) {

        // 1. You are given two numbers n and k. You are required to rotate n, k times
        // to the right. If k is positive, rotate to the right i.e. remove rightmost
        // digit and make it leftmost. Do the reverse for negative value of k. Also k
        // can have an absolute value larger than number of digits in n.
        // 2. Take as input n and k.
        // 3. Print the rotated number.
        // 4. Note - Assume that the number of rotations will not cause leading 0's in
        // the result. e.g. such an input will not be given
        // n = 12340056
        // k = 3
        // r = 05612340
        

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number to be rotated");
        int n = scn.nextInt();
        System.out.println("Rotation value: ");
        int k = scn.nextInt();
        int length = 0;
        int temp = n;

        while (temp != 0) {
            temp = temp / 10;
            length++;
        }

        k = k % length;

        if (k < 0) {
            k = k + length;
        }

        int div = (int) Math.pow(10, k);
        int multi = (int) Math.pow(10, length) / div;

        System.out.println((n % div) * multi + (n / div));
        scn.close();

    }
}
