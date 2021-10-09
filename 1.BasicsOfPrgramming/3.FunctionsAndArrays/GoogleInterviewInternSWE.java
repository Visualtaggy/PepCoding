
/**
 * GoogleInterviewInternSWE
 * 
 * Problem You are given an array containing N distinct integers. You perform
 * the following operations on this array:
 * 
 * For each pair of integers, you find the absolute difference D between those
 * integers and insert D into the array (if it was not already present in the
 * array). You repeat task 1 until the array becomes constant. This implies that
 * the absolute difference between any two elements in the array is also an
 * element present in the array. Write a program to find the Kth largest element
 * of the array after all the operations have been performed. If there is no
 * such element, print -1.
 * 
 * Input format
 * 
 * First line: T (Number of test cases) First line in each test case: N Second
 * line in each test case: N space-separated integer (denoting the elements of
 * the array) Third line in each test case: K
 * 
 * Output format
 * 
 * For each test case, print the Kth largest element of the array. If there is
 * no such element print -1.
 * 
 */
import java.util.*;

public class GoogleInterviewInternSWE {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt();
            int arr[] = new int[n];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int k;
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
                if (arr[i] > max)
                    max = arr[i];
                if (arr[i] < min)
                    min = arr[i];
            }
            k = s.nextInt();
            int is_dev = 1;
            for (int i = 0; i < n; i++) {
                if (arr[i] % min != 0) {
                    is_dev = 0; // easily reach to [1,2,3 .... max]
                    break;
                }
            }
            if (is_dev == 0) {
                n = max - (k - 1);
            } else {
                n = max - min * (k - 1);
            }
            if (n <= 0)
                System.out.println("-1");
            else
                System.out.println(n);

        }
    }
}