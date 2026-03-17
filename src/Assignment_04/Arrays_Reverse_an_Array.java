package Assignment_04;

import java.util.Scanner;

public class Arrays_Reverse_an_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for (int i=0;i<N;i++){
            arr[i]= sc.nextInt();
        }
        ReverseArray(arr);
        for (int j=0;j<arr.length;j++){
            System.out.println(arr[j]+" ");
        }
    }
    public static void ReverseArray(int[] arr){
        int i=0;
        int j=arr.length-1;
        while (j>i){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
        }
    }
}
