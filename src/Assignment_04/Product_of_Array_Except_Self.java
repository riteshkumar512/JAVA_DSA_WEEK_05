package Assignment_04;

import java.util.Scanner;

public class Product_of_Array_Except_Self {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]= sc.nextInt();
        }
        long[] a =product_except_self(arr);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static long[] product_except_self(int[] arr){
        //prefix
        long[] left=new long[arr.length];
        left[0]=1;
        for (int i=1;i< arr.length;i++){
            left[i]=left[i-1]*arr[i-1];
        }
        //suffix
        long[] right=new long[arr.length];
        right[arr.length-1]=1;
        for (int i= arr.length-2;i>= 0;i--){
            right[i]=right[i+1]*arr[i+1];
        }

        //calculation
        for (int i = 0; i < arr.length; i++) {
            left[i]=left[i]*right[i];
        }
        return left;
    }
}
