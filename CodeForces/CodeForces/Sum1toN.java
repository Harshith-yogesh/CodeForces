package CodeForces;
import java.util.Scanner;
public class Sum1toN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long sum = n * (n + 1) / 2;
        System.out.println(sum);
        s.close();
    }
}

