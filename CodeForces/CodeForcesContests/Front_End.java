package DSA.CodeForcesContests;
import java.util.Scanner;
public class Front_End {
    static  void frontend(int n,int arr[]){
        int l=0;
        int r=n-1;
        StringBuilder sb = new StringBuilder();

        while(l<r){
            while (l <= r) {
                sb.append(arr[l++]).append(" ");
                if (l > r) break;
                sb.append(arr[r--]).append(" ");
            }
            System.out.println(sb.toString().trim());
        }

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        frontend(n,arr);
    }
}
