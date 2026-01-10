package CodeForces;
import java.util.Scanner;
public class PowerOf2{
    static void power(long n){
        if(n > 0 && (n & (n - 1)) == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        power(n);
    }
}