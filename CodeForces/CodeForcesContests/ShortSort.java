package DSA.CodeForcesContests;
import java.util.Scanner;
public class ShortSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0){
            String str=s.next();
            if(str.equals("abc") || str.equals("acb") || str.equals("bac") || str.equals("cba")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }

    }
}
