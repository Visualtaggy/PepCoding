import java.util.*;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        // write your code here

        // 1. You are required to check if a given set of numbers is a valid pythagorean
        // triplet.
        // 2. Take as input three numbers a, b and c.
        // 3. Print true if they can form a pythagorean triplet and false otherwise.

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scn.nextInt();
        System.out.println("Enter the second number");
        int b = scn.nextInt();
        System.out.println("Enter the third number");
        int c = scn.nextInt();

        int x = (int) Math.pow(a, 2);
        int y = (int) Math.pow(b, 2);
        int z = (int) Math.pow(c, 2);

        if (x + y == z) {
            System.out.println(true);
        }

        else if (x + z == y) {
            System.out.println(true);
        }

        else if (y + z == x) {
            System.out.println(true);
        }

        else {
            System.out.println(false);
        }
        scn.close();
    }
}
