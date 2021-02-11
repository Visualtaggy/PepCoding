import java.util.*;

public class BarChart {

    // 1. You are given a number n, representing the size of array a.
    // 2. You are given n numbers, representing elements of array a.
    // 3. You are required to print a bar chart representing value of arr a.

    public static int findGreatest(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the total number of bars");
        int n = scn.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the size of each bar:");
            numbers[i] = scn.nextInt();
        }

        int max = findGreatest(numbers);

        for (int i = max; i >= 1; i--) {
            ;
            for (int j = 0; j < numbers.length; j++) {

                if (numbers[j] >= i) {
                    System.out.print("*	");
                }

                else {
                    System.out.print("	");
                }
            }

            System.out.println();

        }
        scn.close();
    }
}
