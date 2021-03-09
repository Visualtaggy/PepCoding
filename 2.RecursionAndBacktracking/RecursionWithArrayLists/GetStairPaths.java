
/**
 * GetStairPaths 1. You are given a number n representing number of stairs in a
 * staircase. 2. You are standing at the bottom of staircase. You are allowed to
 * climb 1 step, 2 steps or 3 steps in one move. 3. Complete the body of
 * getStairPaths function - without changing signature - to get the list of all
 * paths that can be used to climb the staircase up. Use sample input and output
 * to take idea about output.
 * 
 * Note -> The online judge can't force you to write the function recursively
 * but that is what the spirit of question is. Write recursive and not iterative
 * logic. The purpose of the question is to aid learning recursion and not test
 * you.
 */
import java.util.*;

public class GetStairPaths {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of steps: ");
        int n = scn.nextInt();

        ArrayList<String> answer = new ArrayList<>();
        answer = getSteps(n);
        System.out.println(answer);
        scn.close();

    }

    public static ArrayList<String> getSteps(int n) {

        if (n == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        if (n < 0) {
            return new ArrayList<>();
        }

        ArrayList<String> p1 = getSteps(n - 1);
        ArrayList<String> p2 = getSteps(n - 2);
        ArrayList<String> p3 = getSteps(n - 3);

        ArrayList<String> myList = new ArrayList<>();

        for (String value : p1) {
            myList.add("1" + value);
        }

        for (String value : p2) {
            myList.add("2" + value);
        }
        for (String value : p3) {
            myList.add("3" + value);
        }

        return myList;
    }
}