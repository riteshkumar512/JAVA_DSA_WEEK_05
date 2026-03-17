package Assignment_04;

import java.util.Scanner;

public class Arrays_Selection_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for (int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        Sort(arr);
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void Sort(int[]arr){
        for (int i=0;i< arr.length;i++){
            int idx=miniidx(arr,i);
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }

    }
    public static int miniidx(int[] arr,int i){
        int mini=i;
        for (int j = i+1; j < arr.length ; j++) {
            if (arr[j]<arr[mini]){
                mini=j;
            }
        }return mini;
    }
}
