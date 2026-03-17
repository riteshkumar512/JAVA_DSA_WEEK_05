package Assignment_04;

import java.util.Scanner;

public class Squares_of_a_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        int [] arr=new int[N];
        for( int i=0;i<N;i++){
            arr[i]= sc.nextInt();
        }
        Sort(arr);
        for( int i=0;i<N;i++){
            System.out.print(arr[i]+" ");;
        }

    }
    public static void Sort(int[] array){
        Square(array);
        for (int turn = 1; turn < array.length; turn++) {
            for (int i=0 ;i< array.length-turn;i++){
                if (array[i]>array[i+1]) {
                    int temp = array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                }
            }
        }
    }

    public static void Square (int[] arr){
        for (int i=0;i< arr.length;i++){
            arr[i]=arr[i]*arr[i];
        }
    }
}
