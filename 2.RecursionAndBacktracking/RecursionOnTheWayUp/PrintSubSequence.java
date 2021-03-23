import java.util.*;

// 1. You are given a string str.
// 2. Complete the body of printSS function - without changing signature - to calculate and print all subsequences of str.
// Use sample input and output to take idea about subsequences.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
public class PrintSubSequence {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the substring:");
        String str = scn.nextLine();

        printSS(str, "");
        scn.close();
    }

    public static void printSS(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String roq = str.substring(1);

        printSS(roq, ans + ch);
        printSS(roq, ans);
    }
}
