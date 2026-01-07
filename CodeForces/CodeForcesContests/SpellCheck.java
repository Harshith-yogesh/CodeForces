package DSA.CodeForcesContests;
import java.util.Scanner;
import java.util.*;
public class SpellCheck {

        static boolean check(String s) {
            if (s.length() != 5) return false;
            char[] t = {'T','i','m','u','r'};
            char[] a = s.toCharArray();
            Arrays.sort(t);
            Arrays.sort(a);
            return Arrays.equals(t, a);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t> 0) {
                int n = sc.nextInt();
                String s = sc.next();
                System.out.println(check(s) ? "YES" : "NO");
                t--;
            }
        }
    }


