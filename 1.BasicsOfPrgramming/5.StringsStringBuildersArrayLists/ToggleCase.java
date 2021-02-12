import java.util.*;

public class ToggleCase {

    // 1. You are given a string that contains only lowercase and uppercase
    // alphabets.
    // 2. You have to toggle the case of every character of the given string.

    public static String toggleCase(String str) {
        // write your code here

        int magicValue = 32; // Calculated by looking at av table
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            // Taking current value of char
            char current = str.charAt(i);
            int av = current;

            if (av >= 97 && av <= 122) {
                // meaning it is small letter
                av = av - magicValue;
            } else {
                av = av + magicValue;
            }

            current = (char) av;
            answer += current;

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scn.next();
        System.out.println(toggleCase(str));
        scn.close();
    }

}