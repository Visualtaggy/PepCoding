import java.util.*;

public class Kpc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        String str = scn.nextLine();

        ArrayList<String> answer = getKPC(str);

        System.out.println(answer);
        scn.close();
    }

    // Static keyword is used for global arrays
    static String[] keypad = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getKPC(String str) {

        // BASE CASE

        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        // Assuming string was 123

        // Storing 1 here (Removing first char from the string)
        char firstChar = str.charAt(0);

        // Storing 23 here
        String remaining = str.substring(1);

        // Calling the substring
        ArrayList<String> firstCall = getKPC(remaining);

        ArrayList<String> finalAnswer = new ArrayList<>();

        String alphaForNum = keypad[firstChar - '0']; // sub ascii to convert
        // Looping over all the alphabets for the first number (1)
        for (int i = 0; i < alphaForNum.length(); i++) {
            for (String val : firstCall) {
                finalAnswer.add(alphaForNum.charAt(i) + val);
            }
        }
        return finalAnswer;
    }
}
