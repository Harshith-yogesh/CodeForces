package DSA.CodeForcesContests;
import java.util.Scanner;
public class Skibidi {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            String w=s.next();
            String plural = w.substring(0, w.length() - 2) + "i";
             System.out.println(plural);
           }
        }
    }

