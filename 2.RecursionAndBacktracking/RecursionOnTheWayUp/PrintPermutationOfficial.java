// 1. You are given a string str.
// 2. Complete the body of printPermutations function - without changing signature - to calculate and print all permutations of str.
// Use sample input and output to take idea about permutations.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
import java.util.*;

public class PrintPermutationOfficial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String ques = scn.next();
        printPermutations(ques, "");
        scn.close();
    }

    public static void printPermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char firstChar = str.charAt(i);
            String leftString = str.substring(0, i);
            String rightString = str.substring(i + 1);
            String remainingString = leftString + rightString;

            printPermutations(remainingString, ans + firstChar);
        }

    }
}
