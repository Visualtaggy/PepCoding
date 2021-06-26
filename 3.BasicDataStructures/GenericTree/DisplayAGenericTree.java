
/**
 * DisplayAGenericTree
 */

import java.util.*;

public class DisplayAGenericTree {

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node) {
        // Storing ROOT node's data as string
        String str = node.data + " -> ";

        // Looping over root's children
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        // for other children
        for (Node child : node.children) {
            display(child);
        }

    }

    public static void main(String[] args) {

        // Array with the data for a generic tree
        int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };

        // Setting root node to null
        Node root = null;

        // Creating a stack to store generic tree data
        Stack<Node> stack = new Stack<>();

        // Looping over all the elements of a generic tree
        for (int i = 0; i < arr.length; i++) {

            // We remove the element with -1
            if (arr[i] == -1) {
                stack.pop();
            } else {

                Node temp = new Node();
                temp.data = arr[i];

                // IF the stack is NOT empty
                if (stack.size() > 0) {

                    // Adding to list of children
                    stack.peek().children.add(temp);
                } else {
                    // Making the root node
                    root = temp;
                }

                // Pushing element to the stack
                stack.push(temp);
            }
        }

        display(root);
    }
}