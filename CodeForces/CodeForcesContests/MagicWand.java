package DSA.CodeForcesContests;
import java.util.Arrays;
import java.util.Scanner;

public class MagicWand {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt(); // number of test cases

            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                boolean hasEven = false, hasOdd = false;
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                for (int i = 0; i < n; i++) {

                    if (a[i] % 2 == 0) hasEven = true;
                    else hasOdd = true;
                }

                if (hasEven && hasOdd) {
                    Arrays.sort(a);
                }

                for (int i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }

            sc.close();
        }
    }


