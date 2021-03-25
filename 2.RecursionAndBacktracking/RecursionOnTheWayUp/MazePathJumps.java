// 1. You are given a number n and a number m representing number of rows and columns in a maze.
// 2. You are standing in the top-left corner and have to reach the bottom-right corner. 
// 3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
// 4. Complete the body of printMazePath function - without changing signature - to print the list of all paths that can be used to move from top-left to bottom-right.
// Use sample input and output to take idea about output.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
import java.util.*;

public class MazePathJumps {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter size of the rows");
        int n = scn.nextInt();
        System.out.print("Enter size of the coll");
        int m = scn.nextInt();

        printMazePaths(1, 1, n, m, "");

        scn.close();

    }

    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

        // Base
        if (sc == dc && sr == dr) {
            System.out.println(psf);
            return;
        }

        // H
        if (sc < dc) {
            for (int move_size = 1; move_size <= dc - sc; move_size++) {
                printMazePaths(sr, sc + move_size, dr, dc, psf + "h" + move_size);
            }
        }
        // V
        if (sr < dr) {
            for (int move_size = 1; move_size <= dr - sr; move_size++) {
                printMazePaths(sr + move_size, sc, dr, dc, psf + "v" + move_size);
            }
        }
        // D
        if (sc < dc && sr < dr) {
            for (int move_size = 1; move_size <= dr - sr && move_size <= dc - sc; move_size++) {
                printMazePaths(sr + move_size, sc + move_size, dr, dc, psf + "d" + move_size);
            }
        }
    }

}
