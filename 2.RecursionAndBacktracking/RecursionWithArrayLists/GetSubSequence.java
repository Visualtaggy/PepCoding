import java.util.*;

// 1. You are given a string str.
// 2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
// Use sample input and output to take idea about subsequences.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
// Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you

public class GetSubSequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scn.next();
        ArrayList<String> res = gss(str);
        System.out.println(res);
        scn.close();
    }

    public static ArrayList<String> gss(String str) {

        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char firstChar = str.charAt(0);
        String rmString = str.substring(1);

        // This is without charAt(0);
        ArrayList<String> a_block = gss(rmString);

        ArrayList<String> b_block = new ArrayList<>();
        for (String element : a_block) {
            b_block.add("" + element);
        }
        for (String element : a_block) {
            b_block.add(firstChar + element);
        }
        return b_block;
    }

}
