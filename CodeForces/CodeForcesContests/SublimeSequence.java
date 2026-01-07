package DSA.CodeForcesContests;

import java.util.Scanner;

public class SublimeSequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        int[] nArr = new int[t];
        int[] xArr = new int[t];

        for (int i = 0; i < t; i++) {
            nArr[i] = s.nextInt();
            xArr[i] = s.nextInt();
        }

        for (int i = 0; i < t; i++) {
            if (xArr[i] % 2 == 0) {
                System.out.println(0);
            } else {
                System.out.println(nArr[i]);
            }
        }

        s.close();
    }
}
