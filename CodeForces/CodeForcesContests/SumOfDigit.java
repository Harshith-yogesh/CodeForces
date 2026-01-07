package DSA.CodeForcesContests;
import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++) {


            int n = s.nextInt();
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum = sum + digit;
                n = n / 10;

            }
            System.out.println(sum);
        }
    }
}
