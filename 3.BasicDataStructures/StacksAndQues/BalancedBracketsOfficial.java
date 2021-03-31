import java.util.*;
// 1. You are given a string exp representing an expression.
// 2. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.

// e.g.
// [(a + b) + {(c + d) * (e / f)}] -> true
// [(a + b) + {(c + d) * (e / f)]} -> false
// [(a + b) + {(c + d) * (e / f)} -> false
// ([(a + b) + {(c + d) * (e / f)}] -> false

public class BalancedBracketsOfficial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        Stack<Character> st = new Stack<>();

        // Assuming "(a+b)"
        for (int i = 0; i < str.length(); i++) {
        }

    }
}
