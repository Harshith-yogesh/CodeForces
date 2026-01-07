package Sorting;
import java.util.Scanner;
public class InsertionSort {
    static void Sort(int arr[],int n){
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>arr[j+1]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int x:arr) {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        Sort(arr,n);
    }
}
