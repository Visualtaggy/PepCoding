import java.util.*;

// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are given a number x. 
// 4. You are required to find the last index at which x occurs in array a.
// 5. If x exists in array, print the last index where it is found otherwise print -1.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

public class LastIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Size: ");
        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Element: ");
            arr[i] = scn.nextInt();
        }

        System.out.print("Find: ");
        int x = scn.nextInt();

        System.out.println(lastIndex(arr, n - 1, x));
        scn.close();
    }

    public static int lastIndex(int[] arr, int idx, int x) {
        if (idx < 0) {
            return -1;
        }
        if (arr[idx] == x) {
            return idx;
        } else {
            return (lastIndex(arr, idx - 1, x));
        }
    }

}
