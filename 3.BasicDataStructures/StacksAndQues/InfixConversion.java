
// 1. You are given an infix expression.
// 2. You are required to convert it to postfix and print it.
// 3. You are required to convert it to prefix and print it.
import java.util.*;

public class InfixConversion {

    public static int priority(char ops) {
        if (ops == '+' || ops == '-') {
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) throws Exception {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();

        // code

        Stack<String> prefix = new Stack<>();
        Stack<String> postfix = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            if (ch == '(') {
                ops.push(ch);
            } else if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                prefix.push(ch + "");
                postfix.push(ch + "");
            } else if (ch == ')') {
                while (ops.peek() != '(') {
                    // make expression;
                    char op = ops.pop();

                    String postv2 = postfix.pop();
                    String postv1 = postfix.pop();
                    String postv = postv1 + postv2 + op;
                    postfix.push(postv);

                    String prev2 = prefix.pop();
                    String prev1 = prefix.pop();
                    String prev = op + prev1 + prev2;
                    prefix.push(prev);
                }
                ops.pop();
            }

            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (ops.size() > 0 && ops.peek() != '(' && priority(ch) <= priority(ops.peek())) {
                    char op = ops.pop();

                    String prev2 = prefix.pop();
                    String prev1 = prefix.pop();
                    String prev = op + prev1 + prev2;
                    prefix.push(prev);

                    String postv2 = postfix.pop();
                    String postv1 = postfix.pop();
                    String postv = postv1 + postv2 + op;
                    postfix.push(postv);
                }
                ops.push(ch);
            }

        }

        // main func end
        while (ops.size() != 0) {
            char op = ops.pop();

            String prev2 = prefix.pop();
            String prev1 = prefix.pop();
            String prev = op + prev1 + prev2;
            prefix.push(prev);

            String postv2 = postfix.pop();
            String postv1 = postfix.pop();
            String postv = postv1 + postv2 + op;
            postfix.push(postv);
        }

        System.out.println(postfix.peek());
        System.out.println(prefix.peek());
    }

}
