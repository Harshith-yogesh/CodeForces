package CodeForces;
import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Multiples");
        } else {
            System.out.println("No Multiples");
        }

        s.close();
    }
}
