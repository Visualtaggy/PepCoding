import java.util.*;

public class SpanOfAnArray {
    public static void main(String[] args) {
        // 1. You are given a number n, representing the count of elements.
        // 2. You are given n numbers.
        // 3. You are required to find the span of input. Span is defined as difference
        // of maximum value and minimum value.
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n = scn.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter elements of the array:");
            numbers[i] = scn.nextInt();
        }

        int greatestValue = greatestCalculator(numbers);
        int smallestValue = smallestCalculator(numbers);

        System.out.println(greatestValue - smallestValue);
        scn.close();

    }

    public static int greatestCalculator(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int smallestCalculator(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}