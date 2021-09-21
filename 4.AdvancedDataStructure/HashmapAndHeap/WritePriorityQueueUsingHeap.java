// 1. You are required to complete the code of our Priority Queue class using the heap data structure. Please watch the question video carefully. The theoretical details of required functionality is explained in detail there. Implement the functions to achieve what is explained in the theoretical discussion in question video.
// 2. Here is the list of functions that you are supposed to complete:
//     2.1. add -> Should accept new data.
//     2.2. remove -> Should remove and return smallest value, if available or print 
//      "Underflow" otherwise and return -1.
//      2.3. peek -> Should return smallest value, if available or print "Underflow" 
//      otherwise and return -1.
//      2.4. size -> Should return the number of elements available.
// 3. Input and Output is managed for you.

import java.io.*;
import java.util.*;

public class WritePriorityQueueUsingHeap {

    public static class PriorityQueue {
        ArrayList<Integer> data;

        public PriorityQueue() {
            data = new ArrayList<>();
        }

        public void add(int val) {
            // write your code here
            data.add(val);
            move_up(data.size() - 1);
        }

        public void move_up(int idx) {
            if (idx == 0) {
                return;
            }

            int parent = (idx - 1) / 2;

            if (data.get(parent) > data.get(idx)) {
                swap(idx, parent);
                move_up(parent);
            }
        }

        public void swap(int idx1, int idx2) {
            int val1 = data.get(idx1);
            int val2 = data.get(idx2);

            data.set(idx1, val2);
            data.set(idx2, val1);

        }

        public int remove() {
            if (this.size() == 0) {
                System.out.println("Underflow");
                return -1;
            }
            // write your code here
            swap(0, data.size() - 1);
            int val = data.remove(data.size() - 1);
            move_down(0);
            return val;
        }

        public void move_down(int i) {
            int smallest = i;

            int left = (2 * i) + 1;
            if (left < data.size() && data.get(i) > data.get(left)) {
                smallest = left;
            }

            int right = (2 * i) + 2;
            if (right < data.size() && data.get(i) > data.get(right)) {
                smallest = right;
            }

            if (smallest != i) {
                swap(i, smallest);
                move_down(i);
            }
        }

        public int peek() {
            // write your code here
            if (this.size() == 0) {
                System.out.println("Underflow");
                return -1;
            }

            return data.get(0);
        }

        public int size() {
            // write your code here
            return data.size();
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue qu = new PriorityQueue();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("add")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if (str.startsWith("remove")) {
                int val = qu.remove();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("peek")) {
                int val = qu.peek();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(qu.size());
            }
            str = br.readLine();
        }
    }
}