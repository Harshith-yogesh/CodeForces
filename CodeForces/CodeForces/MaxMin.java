package CodeForces;
import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();

        int min= java.lang.Math.min(a, java.lang.Math.min(b,c));
        int max= java.lang.Math.max(a, java.lang.Math.max(b,c));
        System.out.print(min+" "+max);


    }
}
