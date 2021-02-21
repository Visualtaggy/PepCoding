import java.util.Scanner;

public class IncreasingDecreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scn.nextInt();
        scn.close();
        pdi(number);

    }

    public static void pdi(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        pdi(n - 1);
        System.out.println(n);
    }
}
