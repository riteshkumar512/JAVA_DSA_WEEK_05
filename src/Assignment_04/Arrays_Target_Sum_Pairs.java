package Assignment_04;

import java.util.Scanner;

public class Arrays_Target_Sum_Pairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for (int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int target= sc.nextInt();
        pairSum(arr,target);

    }
    public static void pairSum(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==target){
                    int num1=arr[i];
                    int num2=arr[j];
                    if (num1>num2){
                        System.out.println(arr[j]+" "+"and"+" "+arr[i]);
                    }else {
                    System.out.println(arr[i]+" "+"and"+" "+arr[j]);
                    }
                }
            }
        }
    }
}
