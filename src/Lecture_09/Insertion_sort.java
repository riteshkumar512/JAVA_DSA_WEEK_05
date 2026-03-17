package Lecture_09;

public class Insertion_sort {
    public static void main(String[] args) {
//        int[] arr = {1, 4, 7, 8, 9, 11, 2};
        int[] arr={8,9,1,7,4,2,11};
//        InsertLastElement(arr, arr.length - 1);
        Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void Sort(int[] arr){
        for (int i=1;i< arr.length;i++){
            InsertLastElement(arr,i);
        }
    }

    public static void InsertLastElement(int[] arr, int i) {
        int j = i - 1;
        int item = arr[i];
        while (j >= 0 && arr[j] > item) {
            arr[j + 1] = arr[j];
            arr[j] = item;
            j--;
        }
        //return j+1;
    }
}
