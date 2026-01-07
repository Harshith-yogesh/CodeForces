package CodeForces;
import java.util.Scanner;
public class BrothersOrNot {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String f1=s.nextLine();
        String l1=s.nextLine();
        String f2=s.nextLine();
        String l2=s.nextLine();
        if(l1.equals(l2)){
            System.out.println("ARE Brothers");
        }
        else{
            System.out.println("NOT");
        }

    }
}
