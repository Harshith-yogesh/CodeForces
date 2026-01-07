package DSA.CodeForcesContests;
import java.util.Scanner;

public class TripppiTroppi {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String arr1[]=new String[n];
        String arr2[]=new String[n];
        String arr3[]=new String[n];
        for(int i=0;i<n;i++){
            arr1[i]=s.next().toLowerCase();
            arr2[i]=s.next().toLowerCase();
            arr3[i]=s.next().toLowerCase();
        }
        for(int i=0;i<n;i++) {
            System.out.println(""+arr1[i].charAt(0)+ arr2[i].charAt(0) + arr3[i].charAt(0));
        }

    }
}
