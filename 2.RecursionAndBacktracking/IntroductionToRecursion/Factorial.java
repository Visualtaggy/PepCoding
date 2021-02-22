import java.util.*;

// 1. You are given a number n.
// 2. You are required to calculate the factorial of the number. Don't change the signature of factorial function.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = scn.nextInt();

        System.out.println(factorial(n));
        scn.close();
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return (n * factorial(n - 1));

    }
}
