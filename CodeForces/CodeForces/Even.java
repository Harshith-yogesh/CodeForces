package CodeForces;
import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean haseven=false;
        for(int i=2;i<=n;i+=2){

                System.out.println(i);
                haseven=true;

        }
        if(!haseven){
            System.out.println(-1);
        }
    }
}
