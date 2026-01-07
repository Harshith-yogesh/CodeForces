package DSA.CodeForcesContests;
import java.util.Scanner;
public class SquareOrNot {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        int d[]=new int[n];
        for(int i=0;i<n;i++){
             a[i]=s.nextInt();
            b[i]=s.nextInt();
           c[i]=s.nextInt();
            d[i]=s.nextInt();
        }
       for(int i=0;i<n;i++){
           if (a[i] == b[i] && b[i] == c[i] && c[i] == d[i]){
               System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }
       }
    }

}
