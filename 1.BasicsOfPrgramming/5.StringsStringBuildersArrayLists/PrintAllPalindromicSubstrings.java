import java.util.*;

public class PrintAllPalindromicSubstrings {
    // 1. You are given a string.
    // 2. You have to print all palindromic substrings of the given string.

    public static boolean isPalindromic(String str) {
        int l = 0;
        int r = str.length() - 1;

        while (l <= r) {
            char ch1 = str.charAt(l);
            char ch2 = str.charAt(r);

            if (ch1 != ch2) {
                return false;
            } else {
                l++;
                r--;
            }

        }
        return true;
    }

    public static void solution(String str) {
        // write your code here

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String check = str.substring(i, j);
                if (isPalindromic(check) == true) {
                    System.out.println(check);
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = scn.next();
        solution(str);
        scn.close();
    }

}