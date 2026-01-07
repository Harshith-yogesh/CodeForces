package DSA.CodeForcesContests;
import java.util.Scanner;
public class Rating {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        boolean rated=false;
        for(int i=0;i<n;i++){
            arr1[i]=s.nextInt();
            arr2[i]=s.nextInt();
            if(arr1[i]!=arr2[i]){
                rated=true;
            }
        }
        if(rated){
            System.out.println("rated");
            return;
        }
        for(int i=0;i<n-1;i++){
            if(arr1[i]<arr2[i+1]){
                System.out.println("unrated");
                return ;
            }
        }
        System.out.println("maybe");

    }
}
