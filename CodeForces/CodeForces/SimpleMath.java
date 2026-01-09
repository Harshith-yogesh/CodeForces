package CodeForces;
import java.util.Scanner;
public class SimpleMath{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String exp = s.next();

        int a = 0, b = 0;
        char op = '+';

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                op = ch;
                a = Integer.parseInt(exp.substring(0, i));
                b = Integer.parseInt(exp.substring(i + 1));
                break;
            }
        }

        if (op == '+') System.out.print(a + b);
        else if (op == '-') System.out.print(a - b);
        else if (op == '*') System.out.print(a * b);
        else System.out.print(a / b);
    }
}
