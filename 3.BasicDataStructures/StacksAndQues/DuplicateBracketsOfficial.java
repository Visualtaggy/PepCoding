// 1. You are given a string exp representing an expression.
// 2. Assume that the expression is balanced  i.e. the opening and closing brackets match with each other.
// 3. But, some of the pair of brackets maybe extra/needless. 
// 4. You are required to print true if you detect extra brackets and false otherwise.

// e.g.'
// ((a + b) + (c + d)) -> false
// (a + b) + ((c + d)) -> true
import java.util.*;

public class DuplicateBracketsOfficial {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the equation: ");
        String str = scn.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char currentChar = str.charAt(i);

            if (currentChar == ')') {

                if (stack.peek() == '(') {
                    System.out.println(true);
                    scn.close();
                    return;
                } else {

                    // start popping out elements + one opening bracket
                    while (stack.peek() != '(') {
                        stack.pop();
                    }
                    // removing 1 opening bracket
                    stack.pop();
                }
            } else {
                // keep pushing into stack
                stack.push(currentChar);
            }

        }
        System.out.println(false);
        scn.close();

    }

}