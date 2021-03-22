
/**
 * GetMazePath
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