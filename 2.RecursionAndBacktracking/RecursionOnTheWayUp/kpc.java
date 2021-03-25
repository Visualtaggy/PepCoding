import java.util.Scanner;

// 1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
// 2. The following list is the key to characters map
//     0 -> .;
//    1 -> abc
//    2 -> def
//    3 -> ghi
//    4 -> jkl
//    5 -> mno
//    6 -> pqrs
//    7 -> tu
//    8 -> vwx
//    9 -> yz
// 3. Complete the body of printKPC function - without changing signature - to print the list of all words that could be produced by the keys in str.
// Use sample input and output to take idea about output.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.     

public class kpc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String str = scn.nextLine();

        getKPC(str, "");

        scn.close();
    }

    static String[] keypad = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void getKPC(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Assuming string was 123
        // Storing 1 here (Removing first char from the string)
        char firstChar = str.charAt(0);
        // Storing 23 here
        String remaining = str.substring(1);

        String keypadCode = keypad[firstChar - '0'];

        for (int i = 0; i < keypadCode.length(); i++) {
            char single_key = keypadCode.charAt(i);
            getKPC(remaining, ans + single_key);
        }

    }
}
