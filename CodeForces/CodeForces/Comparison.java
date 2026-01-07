package CodeForces;
import java.util.Scanner;
public class Comparison {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        String S=s.next();
        int b=s.nextInt();

       if (S.equals(">")) {
           if (a > b) {
               System.out.println("Right");
           }
           else{
               System.out.println("Wrong");
           }
       }
        else if (S.equals("<")){
            if (a < b) {
                System.out.println("Right");
            }
            else{
                System.out.println("Wrong");
            }
        }
        else if (S.equals("=")){
            if (a == b) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        }
    }
}
