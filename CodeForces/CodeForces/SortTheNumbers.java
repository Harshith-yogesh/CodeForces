package CodeForces;
import java.util.Scanner;
import java.util.*;

public class SortTheNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int[] original={a,b,c};

        int []sorted={a,b,c};
        Arrays.sort(sorted);

   for(int num:sorted){
       System.out.println(num);
   }
        System.out.println();
        for(int num:original){
            System.out.println(num);
        }
        s.close();
    }
}
