import java.util.*;

public class StringCompression {

    // 1. You are given a string.
    // 2. You have to compress the given string in the following two ways -
    // First compression -> The string should be compressed such that consecutive
    // duplicates of characters are replaced with a single character.
    // For "aaabbccdee", the compressed string will be "abcde".
    // Second compression -> The string should be compressed such that consecutive
    // duplicates of characters are replaced with the character and followed by the
    // number of consecutive duplicates.
    // For "aaabbccdee", the compressed string will be "a3b2c2de2".

    public static String compression1(String str) {
        // write your code here
        String answer = str.substring(0, 1);
        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            char previous = str.charAt(i - 1);

            if (previous == current) {
                continue;
            } else {
                answer += current;
            }
        }

        return answer;
    }

    public static String compression2(String str) {

        String answer = str.substring(0, 1);
        int counter = 1;

        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            char previous = str.charAt(i - 1);

            if (current == previous) {
                counter++;
            } else {
                if (counter > 1) {
                    answer += counter;
                    counter = 1;
                }
                answer += current;
            }
        }
        if (counter > 1) {
            answer += counter;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
        scn.close();
    }

}