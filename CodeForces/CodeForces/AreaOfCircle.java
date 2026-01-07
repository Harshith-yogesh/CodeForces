package CodeForces;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double r = s.nextDouble(); // use double for precision

        double area = 3.141592653 * r * r; // more accurate pi

        System.out.printf("%.9f\n", area);

        s.close();
    }
}
