
// 1. You are given a string str.
// 2. You are required to find the character with maximum frequency.
import java.io.*;
import java.util.*;

public class HighestFrequencyCharacter {

    public static void main(String[] args) throws Exception {
        // write your code

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (hm.containsKey(ch)) {
                int current_freq = hm.get(ch);
                int new_freq = current_freq + 1;

                hm.put(ch, new_freq);
            } else {
                hm.put(ch, 1);
            }

        }

        char max = str.charAt(0);
        for (Character key : hm.keySet()) {
            if (hm.get(key) > hm.get(max)) {
                max = key;
            }
        }

        System.out.println(max);
    }

}