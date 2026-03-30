package Assignment_04;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Target_Sum_Triplets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int target= sc.nextInt();
        TripletSum(arr,target);

    }
    public static void TripletSum(  int[]arr,int target){
//        Arrays.sort(arr);
        Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i]+arr[j]+arr[k]==target){
                        System.out.println(arr[i]+","+arr[j]+" and "+arr[k]);
                    }
                }
            }
        }
    }
    public static void Sort(int[]arr){
        for (int i = 1; i < arr.length; i++) {
            InsertlastElem(arr,i);
        }
    }
    public static void InsertlastElem(int[] arr,int i){
        int item=arr[i];
        int j=i-1;
        while (j>=0 && arr[j]>item){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=item;
    }
}
