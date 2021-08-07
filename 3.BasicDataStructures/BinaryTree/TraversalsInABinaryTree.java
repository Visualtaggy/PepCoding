
/*Understanding the flow of a binary tree
with things like Pre-Order In-Order and Post-Order*/
import java.util.*;

public class TraversalsInABinaryTree {

    public static void treversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data + " in preorder");
        treversal(node.left);
        System.out.println(node.data + " in inorder");
        treversal(node.right);
        System.out.println(node.data + " in postorder");
    }

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

    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static void display(Node root) {
        if (root == null) {
            return;
        }
        String answer = "";
        answer += root.left == null ? "." : root.left.data + "";
        answer += "<- " + root.data + " ->";
        answer += root.right == null ? "." : root.right.data + "";
        System.out.println(answer);
        display(root.left);
        display(root.right);

    }

    public static void main(String[] args) {
        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
                null };

        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int index = 0;
        while (st.size() > 0) {
            Pair top = st.peek();

            if (top.state == 1) {
                // left side
                index++;
                if (arr[index] != null) {
                    Node left = new Node(arr[index], null, null);
                    Pair lp = new Pair(left, 1);
                    top.node.left = left;
                    st.push(lp);
                } else {
                    top.node.left = null;
                }
                top.state++;
            } else if (top.state == 2) {
                // right side
                index++;
                if (arr[index] != null) {
                    Node right = new Node(arr[index], null, null);
                    Pair rp = new Pair(right, 1);
                    top.node.right = right;
                    st.push(rp);
                } else {
                    top.node.right = null;
                }
                top.state++;

            } else {
                st.pop();
            }
        }

        // display(root);
        treversal(root);
    }

}
