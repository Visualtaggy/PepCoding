
// 1. You are given an infix expression.
// 2. You are required to evaluate and print it's value.
import java.util.*;

public class InfixEvaluation {

    public static int priority(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else {
            return 2;
        }
    }

    public static int operation(int v1, int v2, char op) {
        if (op == '+') {
            return v1 + v2;
        } else if (op == '-') {
            return v1 - v2;
        } else if (op == '/') {
            return v1 / v2;
        } else {
            return v1 * v2;
        }
    }

    public static void main(String[] args) throws Exception {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        scn.close();
        // code
        Stack<Integer> vs = new Stack<>();
        Stack<Character> os = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                os.push(ch);
            } else if (Character.isDigit(ch)) {
                vs.push(ch - '0');
            } else if (ch == ')') {
                while (os.peek() != '(') {
                    char op = os.pop();
                    int v2 = vs.pop();
                    int v1 = vs.pop();

                    int val = operation(v1, v2, op);
                    vs.push(val);
                }
                os.pop();
            } else if (ch == '*' || ch == '/' || ch == '+' || ch == '-') {
                while (os.size() > 0 && os.peek() != '(' && priority(ch) <= priority(os.peek())) {
                    char op = os.pop();
                    int v2 = vs.pop();
                    int v1 = vs.pop();

                    int val = operation(v1, v2, op);
                    vs.push(val);
                }

                os.push(ch);
            }

        }
        // Clearing out extra operators from the stack
        while (os.size() != 0) {
            char op = os.pop();
            int v2 = vs.pop();
            int v1 = vs.pop();

            int val = operation(v1, v2, op);
            vs.push(val);
        }

        System.out.println(vs.peek());

    }
}
