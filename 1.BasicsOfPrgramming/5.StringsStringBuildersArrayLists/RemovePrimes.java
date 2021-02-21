import java.util.*;

public class RemovePrimes {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Size of arrayList:");
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element:");
            al.add(scn.nextInt());
        }
        solution(al);
        System.out.println(al);
        scn.close();
    }

    public static void solution(ArrayList<Integer> al) {
        // write your code here
        for (int i = al.size() - 1; i >= 0; i--) {
            int value = al.get(i);

            if (checkPrime(value) == true) {
                al.remove(i);
            }
        }
    }

    public static boolean checkPrime(int n) {
        for (int div = 2; div * div <= n; div++) {
            if (n % div == 0) {
                return false;
            }
        }
        return true;
    }
}