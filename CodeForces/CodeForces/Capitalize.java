package CodeForces;
import java.util.Scanner;
public class Capitalize {
    static  void Capitalize(String str){
        if(!str.isEmpty()&& Character.isLowerCase(str.charAt(0))){
            str=Character.toUpperCase(str.charAt(0))+str.substring(1);
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        Capitalize(str);
    }
}
