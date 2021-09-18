
import java.util.*;

public class HeapsIntroductionAndUsage {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int[] ranks = { 22, 99, 3, 11, 88, 4, 1 };

        for (int val : ranks) {
            pq.add(val);
        }

        // Using heap sort
        while (pq.size() > 0) {
            System.out.println(pq.peek());
            pq.remove();
        }

    }
}
