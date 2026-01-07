package CodeForces;
import  java.util.Scanner;
public class LastDigitSum {
    static void SumOfDigits(int n,int arr[]){
        int sum=0;
    for(int i=0;i<n;i++){
        int lastdigit=arr[i]%10;
        sum=sum+lastdigit;
    }
        System.out.println("The sum of the Last Digits is :"+sum);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array Elements:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        SumOfDigits(n,arr);
    }
}
