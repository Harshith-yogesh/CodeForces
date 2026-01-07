package CodeForces;
import java.util.Scanner;
public class FirstDigit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        n= Math.abs(n);
        int first=n;
        while(first>=10){
              first=first/10;
        }
        if(first%2==0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }
}
