import java.util.*;

public class PrintDecreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n = scn.nextInt();
        printDecreasing(n);
        scn.close();
    }

    public static void printDecreasing(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        printDecreasing(n - 1);
    }

}