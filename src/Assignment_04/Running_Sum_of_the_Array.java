package Assignment_04;

import java.util.Scanner;

public class Running_Sum_of_the_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        int [] arr=new int[N];
        for( int i=0;i<N;i++){
            arr[i]= sc.nextInt();
        }
        prefixSumIncludingIndex(arr);
        for (int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void prefixSumIncludingIndex(int[] array){
        array[0]= array[0];
        for (int i=1;i< array.length;i++){
            array[i]=array[i-1]+array[i];
        }
    }
}
