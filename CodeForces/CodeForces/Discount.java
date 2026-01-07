package CodeForces;
import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int p=s.nextInt();
         double total_price= p / (1-(x/100.0));
        System.out.printf("%.2f",total_price);
        s.close();
    }
}
