
/**
 * GetMazePathWithJumps 1. You are given a number n and a number m representing
 * number of rows and columns in a maze. 2. You are standing in the top-left
 * corner and have to reach the bottom-right corner. 3. In a single move you are
 * allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more
 * steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2,
 * ..). 4. Complete the body of getMazePath function - without changing
 * signature - to get the list of all paths that can be used to move from
 * top-left to bottom-right. Use sample input and output to take idea about
 * output.
 * 
 * Note -> The online judge can't force you to write the function recursively
 * but that is what the spirit of question is. Write recursive and not iterative
 * logic. The purpose of the question is to aid learning recursion and not test
 * you.
 */
import java.util.*;

public class GetMazePathWithJumps {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        // Assuming SR SC as 1 , 1 respectively;
        ArrayList<String> answer = mazePathFinder(1, 1, n, m);
        System.out.println(answer);
        scn.close();
    }

    public static ArrayList<String> mazePathFinder(int sr, int sc, int dr, int dc) {

        // BaseCase of recursion
        if (sc == dc && sr == dr) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> finalPath = new ArrayList<>();

        // Computing horizontal path
        for (int move_size = 1; move_size <= dc - sc; move_size++) {
            // Getting path for every move size
            ArrayList<String> horizontal_path = mazePathFinder(sr, sc + move_size, dr, dc);

            // adding h + move size infront of the path
            for (String val : horizontal_path) {
                finalPath.add("h" + move_size + val);
            }
        }

        // Computing vertial path
        for (int move_size = 1; move_size <= dr - sr; move_size++) {
            // Getting path for every move size
            ArrayList<String> vertical_path = mazePathFinder(sr + move_size, sc, dr, dc);

            // adding v + move size infront of the path
            for (String val : vertical_path) {
                finalPath.add("v" + move_size + val);
            }
        }

        // Computing diagonal path size
        for (int move_size = 1; move_size <= dr - sr && move_size <= dc - sc; move_size++) {
            // Getting path for every move size
            ArrayList<String> diagonal_path = mazePathFinder(sr + move_size, sc + move_size, dr, dc);
            // adding d + move size infront of the path
            for (String val : diagonal_path) {
                finalPath.add("d" + move_size + val);
            }
        }

        return finalPath;
    }
}