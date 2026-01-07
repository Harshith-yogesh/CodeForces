package DSA.CodeForcesContests;
import java.util.Scanner;
public class MaxProduct {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0){
            int n=s.nextInt();
            long arr[]=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
            long maxproduct=0;
            for(int i=0;i<n;i++){
                arr[i]++;
                long product =1;
                for(int j=0;j<n;j++){
                    product =product*arr[j];
                }
                maxproduct=Math.max(product,maxproduct);
                arr[i]--;
            }
            System.out.println(maxproduct);
            t--;
        }
      s.close();
    }
}
