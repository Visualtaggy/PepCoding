// 1. You are given a string exp representing an expression.
// 2. You are required to check if the expression is balanced i.e. closing
// brackets and opening brackets match up well.

// e.g.
// [(a + b) + {(c + d) * (e / f)}] -> true
// [(a + b) + {(c + d) * (e / f)]} -> false
// [(a + b) + {(c + d) * (e / f)} -> false
// ([(a + b) + {(c + d) * (e / f)}] -> false

import java.util.*;

public class BalancedBrackets {

    public static boolean edgeCaseDetector(Stack<Character> st, char ref) {

        if (st.size() == 0) {
            return false;
        } else if (st.peek() != ref) {
            return false;
        } else {
            st.pop();
            return true;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        scn.close();

        Stack<Character> st = new Stack<>();

        // Looping over elements of the string
        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);
            if (current == '(' || current == '{' || current == '[') {
                st.push(current);
            } else if (current == ')') {
                boolean val = edgeCaseDetector(st, '(');
                if (val == false) {
                    System.out.println(val);
                    return;
                }

            } else if (current == '}') {
                boolean val = edgeCaseDetector(st, '{');
                if (val == false) {
                    System.out.println(val);
                    return;
                }

            } else if (current == ']') {
                boolean val = edgeCaseDetector(st, '[');
                if (val == false) {
                    System.out.println(val);
                    return;
                }

            }

        }

        if (st.size() == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

}