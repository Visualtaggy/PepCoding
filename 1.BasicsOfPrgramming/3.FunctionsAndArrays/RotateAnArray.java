import java.io.*;

public class RotateAnArray {

    // 1. You are given a number n, representing the size of array a.
    // 2. You are given n numbers, representing elements of array a.
    // 3. You are given a number k.
    // 4. Rotate the array a, k times to the right (for positive values of k), and
    // to
    // the left for negative values of k.
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void reverse(int[] a, int i, int j) {
        int li = i;
        int ri = j;

        while (li < ri) {
            int temp = a[li];

            a[li] = a[ri];
            a[ri] = temp;

            li++;
            ri--;
        }
    }

    public static void rotate(int[] a, int k) {
        // write your code here

        k = k % a.length;

        if (k < 0) {
            k = k + a.length;
        }

        // p1
        reverse(a, 0, a.length - k - 1);

        // p2
        reverse(a, a.length - k, a.length - 1);

        // p3

        reverse(a, 0, a.length - 1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Size of an array?");
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Elements?");
            a[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Rotate value?");
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        display(a);
    }

}