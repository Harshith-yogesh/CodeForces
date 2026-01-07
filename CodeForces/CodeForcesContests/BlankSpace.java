package DSA.CodeForcesContests;
import java.util.Scanner;
public class BlankSpace {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int maxblank = 0;
            int current = 0;
            for (int i = 0; i < n; i++) {
                int val = s.nextInt();
                if (val == 0) {
                    current++;
                    maxblank = Math.max(maxblank, current);
                } else {
                    current = 0;
                }
            }
            System.out.println(maxblank);
        }
        s.close();
    }
}
