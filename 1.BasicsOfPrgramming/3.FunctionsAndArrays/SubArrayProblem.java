import java.util.*;

public class SubArrayProblem {
    // 1. You are given an array of size 'n' and n elements of the same array.
    // 2. You are required to find and print all the subarrays of the given array.
    // 3. Each subarray should be space seperated and on a seperate lines. Refer to
    // sample input and output.

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = scn.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the elements");
            numbers[i] = scn.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i; j < numbers.length; j++) {

                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + "	");
                }
                System.out.println();
            }

        }
        scn.close();
    }

}