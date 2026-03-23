package Assignment_04;

import java.util.Scanner;

public class Inverse_of_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int[] result=Inverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] Inverse(int[] arr){
        int []invArr=new int[arr.length];
        for (int i=0;i< arr.length;i++){
            int j=arr[i];
            invArr[j]=i;
        }
        return invArr;
    }
}
