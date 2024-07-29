import java.util.*;

public class Main {
    public static int eval(String exp) {
        Stack<Integer> opd = new Stack<>();
        Stack<Character> opt = new Stack<>();

        int i = 0;
        while (i < exp.length()) {
            if (Character.isDigit(exp.charAt(i))) {
                int num = 0;
                while (i < exp.length() && Character.isDigit(exp.charAt(i))) {
                    num = num * 10 + exp.charAt(i) - '0';
                    i++;
                }
                opd.push(num);
            } else if (exp.charAt(i) == '+' || exp.charAt(i) == '-' || exp.charAt(i) == '/' || exp.charAt(i) == '*') {
                while (!opt.isEmpty() && precedence(opt.peek()) >= precedence(exp.charAt(i))) {
                    char op = opt.pop();
                    int n2 = opd.pop();
                    int n1 = opd.pop();
                    opd.push(operation(n1, n2, op));
                }
                opt.push(exp.charAt(i));
                i++;
            } else {
                i++;
            }
        }

        while (!opt.isEmpty()) {
            char op = opt.pop();
            int n2 = opd.pop();
            int n1 = opd.pop();
            opd.push(operation(n1, n2, op));
        }

        return opd.pop();
    }

    public static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '/':
            case '*':
                return 2;
        }
        return -1;
    }

    public static int operation(int n1, int n2, char op) {
        switch (op) {
            case '+':
                return n1 + n2;
            case '-':
                return n1 - n2;
            case '/':
                return n1 / n2;
            case '*':
                return n1 * n2;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = eval(str);
        System.out.println("The Answer is : " + n);
    }
}
