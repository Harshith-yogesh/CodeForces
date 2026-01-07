package DSA.CodeForcesContests;
import java.util.Scanner;
public class AorB {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                String s = sc.next();
                int countA = 0, countB = 0;
                for (int i = 0; i < 5; i++) {
                    if (s.charAt(i) == 'A') countA++;
                    else countB++;
                }
                if (countA > countB) System.out.println("A");
                else System.out.println("B");
            }
            sc.close();
        }
    }


