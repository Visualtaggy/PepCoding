import java.util.*;

public class FindElementInAnArray {
    public static void main(String[] args) {
        // 1.You are given a number n, representing the size of array a.
        // 2.You are given n distinct numbers, representing elements of array a.
        // 3. You are given another number d.
        // 4. You are required to check if d number exists in the array a and at what
        // index (0 based). If found print the index, otherwise print -1.
        // write your code here

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scn.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the elements of the array:");
            numbers[i] = scn.nextInt();
        }
        System.out.println("Element to find?");
        int check = scn.nextInt();
        int result = presenceChecker(numbers, check);

        System.out.println(result);
        scn.close();

    }

    public static int presenceChecker(int[] arr, int find) {

        int answer = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == find) {
                answer = i;
            }

        }

        return answer;
    }
}
