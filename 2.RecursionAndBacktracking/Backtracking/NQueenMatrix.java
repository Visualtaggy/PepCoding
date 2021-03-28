import java.util.*;

// 1. You are given a number n, the size of a chess board.
// 2. You are required to place n number of queens in the n * n cells of board such that no queen can kill another.
// Note - Queens kill at distance in all 8 directions
// 3. Complete the body of printNQueens function - without changing signature - to calculate and print all safe configurations of n-queens. Use sample input and output to get more idea.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

public class NQueenMatrix {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[][] arr = new int[n][n];

        printNQueens(arr, "", 0);
        scn.close();
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if (row == chess.length) {
            System.out.println(qsf = ".");
            return;
        }

        for (int col = 0; col < chess.length; col++) {
            if (checkSafety(chess, row, col) == true) {
                // placing queen
                chess[row][col] = 1;
                // recursive call
                printNQueens(chess, qsf + row + "-" + col + ", ", row + 1);
                // removing queen
                chess[row][col] = 0;
            }
        }
    }

    public static boolean checkSafety(int[][] board, int row, int col) {
        // row - 1 coz on row the queen is sitting
        // CHECKING VERTICALLY UPP
        for (int i = row - 1, j = col; i >= 0; i--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // LEFT D
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        // Right D
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }
}