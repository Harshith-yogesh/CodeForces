package CodeForces;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int i = 3;
        long l = 12345678912345L;
        char c ="a".charAt(0);
        float f =334.23f;
        double d =14049.30493D;

        System.out.println(i);
        System.out.println(l);
        System.out.println(c);
        System.out.printf("%.2f\n", f);
        System.out.printf("%.1f\n", d);

        s.close();
    }
}
