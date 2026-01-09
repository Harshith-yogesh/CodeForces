package CodeForces;
import java.util.Scanner;
public class AgeYearMonthDays {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int age=s.nextInt();
        int year=age/365;
        int remainingdays=age%365;
        int months=remainingdays/30;
        int days=remainingdays%30;
        System.out.println(year+" years");
        System.out.println(months+" months");
        System.out.println(days+" days");
    }
}
