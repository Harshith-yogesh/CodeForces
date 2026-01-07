package DSA.CodeForcesContests;
import  java.util.Scanner;
public class GCD {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                long[] a = new long[n];
                for (int i = 0; i < n; i++) a[i] = sc.nextLong();

                long g = a[0];
                for (int i = 1; i < n; i++) {
                    g = gcd(g, a[i]);
                }

                if (g == 1) {
                    System.out.println(2);
                    continue;
                }

                long ans = -1;
                for (long x = 2; x <= 100; x++) { // small numbers are enough
                    if (gcd(g, x) == 1) {
                        ans = x;
                        break;
                    }
                }

                System.out.println(ans);
            }
            sc.close();
        }

        static long gcd(long a, long b) {
            while (b != 0) {
                long temp = a % b;
                a = b;
                b = temp;
            }
            return a;
        }
    }


