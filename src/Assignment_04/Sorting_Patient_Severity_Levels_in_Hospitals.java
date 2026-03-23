package Assignment_04;

import java.util.Scanner;

public class Sorting_Patient_Severity_Levels_in_Hospitals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]= sc.nextInt();
        }
    Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }

    }
    public static void Sort(int[] arr){
        for (int turn = 1; turn < arr.length; turn++) {
            for (int i = 0; i < arr.length-turn; i++) {
                if (arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
}
