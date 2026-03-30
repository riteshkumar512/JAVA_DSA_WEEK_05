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
        int i=0;
        int j= arr.length-1;
        while (i<=j){
            if (arr[i]==1){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               j--;
            }
            if (arr[i]==0){
                i++;
            }
        }
    }

}
