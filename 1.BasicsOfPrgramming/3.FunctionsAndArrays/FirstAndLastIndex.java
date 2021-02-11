import java.util.*;

public class FirstAndLastIndex {

    // 1. You are given a number n, representing the size of array a.
    // 2. You are given n numbers, representing elements of array a.

    // Asssumption - Array is sorted. Array may have duplicate values.

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Size?");
        int n = scn.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("elements?");
            numbers[i] = scn.nextInt();
        }
        System.out.println("value of d ?");
        int d = scn.nextInt();

        int l = 0;
        int h = numbers.length - 1;
        int highIndex = -1;
        int lowIndex = -1;

        while (l <= h) {

            int mid = (l + h) / 2;
            if (d > numbers[mid]) {
                l = mid + 1;
            } else if (d < numbers[mid]) {
                h = mid - 1;
            } else {

                highIndex = mid;
                l = mid + 1;
            }
        }

        l = 0;
        h = numbers.length - 1;

        while (l <= h) {

            int mid = (l + h) / 2;
            if (d > numbers[mid]) {
                l = mid + 1;
            } else if (d < numbers[mid]) {
                h = mid - 1;
            } else {
                lowIndex = mid;
                h = mid - 1;
            }
        }
        System.out.println(lowIndex);
        System.out.println(highIndex);
        scn.close();
    }

}