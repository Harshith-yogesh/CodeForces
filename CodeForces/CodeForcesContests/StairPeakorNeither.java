package DSA.CodeForcesContests;
import java.util.Scanner;
public class StairPeakorNeither {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
             b[i]=s.nextInt();
          c[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]<b[i] && b[i]<c[i] ){
                System.out.println("STAIR");
            }
            else if(a[i]<b[i] && b[i]>c[i] ){
                System.out.println("PEAK");
            }
            else{
                System.out.println("NONE");
            }
        }
    }
}
