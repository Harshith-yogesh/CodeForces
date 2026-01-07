package CodeForces;
import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
 int original=n;
 int reversed=0;
 while(n!=0){
     int digit=n%10;
     reversed=reversed*10+digit;
     n=n/10;
 }
 if(original==reversed){
     System.out.println("YES");
 }
 else{
     System.out.println("NO");
 }
    }
}
