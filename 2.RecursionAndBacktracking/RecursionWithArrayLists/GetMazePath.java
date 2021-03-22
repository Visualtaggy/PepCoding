
/**
 * GetMazePath
 * 1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
3. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
 */
import java.util.*;

public class GetMazePath {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Number of rows in the MATRIX: ");
        int n = scn.nextInt();
        System.out.print("Number of colls in the MATRIX: ");
        int m = scn.nextInt();

        ArrayList<String> answer = getMazePath(1, 1, n, m);
        System.out.println(answer);
        scn.close();
    }

    public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc) {

        // Base Case
        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> pathH = new ArrayList<>();
        ArrayList<String> pathV = new ArrayList<>();

        if (sc < dc) {
            pathH = getMazePath(sr, sc + 1, dr, dc);
        }
        if (sr < dr) {
            pathV = getMazePath(sr + 1, sc, dr, dc);
        }

        ArrayList<String> finalAnswer = new ArrayList<>();

        for (String val : pathH) {
            finalAnswer.add("h" + val);
        }

        for (String val : pathV) {
            finalAnswer.add("v" + val);
        }
        return finalAnswer;
    }

}