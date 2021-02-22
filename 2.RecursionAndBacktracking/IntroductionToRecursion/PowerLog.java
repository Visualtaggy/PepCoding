import java.util.*;

public record PowerLog() {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Number: ");
        int number = scn.nextInt();
        System.out.print("Power: ");
        int power = scn.nextInt();

        System.out.println(power(number, power));
        scn.close();
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int a = power(x, n / 2);
        int b = a * a;

        if (n % 2 == 1) {
            b *= x;
        }
        return (b);

    }
}
