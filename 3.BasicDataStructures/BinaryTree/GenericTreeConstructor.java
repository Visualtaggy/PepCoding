import java.util.*;

public class GenericTreeConstructor {

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void main(String[] args) {
        // array containing all the elements to insert inside the binary tree
        int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };

        Node root = null;
        // Making a stack to store the elements
        Stack<Node> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                // Creating a new node
                Node t = new Node();
                // setting data for the node
                t.data = arr[i];

                // Adding element to the top element's children's list
                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }

        }
    }
}
