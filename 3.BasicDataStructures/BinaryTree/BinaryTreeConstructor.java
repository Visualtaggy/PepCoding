
/**
 * BinaryTree This is the introduction to binary tree how it's declared
 */
import java.util.*;

public class BinaryTreeConstructor {

    public static class Node {
        int data;

        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    // custom type Pair for our stack
    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static void main(String[] args) {
        // Passing the structure of the binary tree in an array
        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
                null };
        // Making root node with left and right null
        Node root = new Node(arr[0], null, null);
        Pair rp = new Pair(root, 1);

        // Creating a stack
        Stack<Pair> st = new Stack<>();
        // pushing root pair with it's state
        st.push(rp);

        // Adding all elements
        int index = 0;
        while (st.size() > 0) {
            Pair top = st.peek();

            if (top.state == 1) {
                index++;
                if (arr[index] != null) {
                    // Creating a new node
                    Node left = new Node(arr[index], null, null);
                    // setting the node
                    top.node.left = left;
                    // creating a pair
                    Pair lp = new Pair(left, 1);
                    // pushing the pair
                    st.push(lp);
                } else {
                    top.node.left = null;
                }
                top.state++;
            } else if (top.state == 2) {
                index++;
                if (arr[index] != null) {
                    Node right = new Node(arr[index], null, null);
                    top.node.right = right;
                    Pair rip = new Pair(right, 1);
                    st.push(rip);
                } else {
                    top.node.right = null;
                }
                top.state++;
            } else {
                index++;
                st.pop();
            }
        }
    }
}
