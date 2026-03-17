package Assignment_04;

import java.util.Scanner;

public class Sort_just_Zeroes_and_Ones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [] arr=new int[N];
        for (int i=0;i<=N-1;i++){
        arr[i]=sc.nextInt();
        }
        sort(arr);
        for (int j=0;j<arr.length;j++){
        System.out.print(arr[j]+" ");
        }
    }
    public static void sort(int[] arr){
        for (int i=0;i< arr.length;i++){
            int idx=miniidx(arr,i);
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;

        }
    }
    public static int miniidx(int[] arr,int i){
        int mini=i;
        for (int j=i+1;j< arr.length;j++){
            if (arr[j]<arr[mini]){
                mini=j;
            }
        }

        return mini ;
    }
}
