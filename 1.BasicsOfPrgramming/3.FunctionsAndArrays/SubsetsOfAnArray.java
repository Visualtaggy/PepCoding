import java.util.*;

public class SubsetsOfAnArray {

    // 1. You are given a number n, representing the count of elements.
    // 2. You are given n numbers.
    // 3. You are required to print all subsets of arr. Each subset should be
    // on separate line. For more clarity check out sample input and output.
    // - - -
    // - - 30
    // - 20 -
    // - 20 30
    // 10 - -
    // 10 - 30
    // 10 20 -
    // 10 20 30
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        System.out.println("Size?");
        int n = scn.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("elements?");
            numbers[i] = scn.nextInt();
        }

        int limit = (int) Math.pow(2, numbers.length);

        for (int i = 0; i < limit; i++) {
            String set = "";
            int temp = i;

            for (int j = numbers.length - 1; j >= 0; j--) {

                int r = temp % 2;
                temp = temp / 2;

                if (r == 0) {
                    set = "-" + "	" + set;
                } else {
                    set = numbers[j] + "	" + set;
                }
            }

            System.out.println(set);
        }
        scn.close();
    }

}