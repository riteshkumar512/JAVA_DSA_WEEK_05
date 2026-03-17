package Lecture_08;

public class Reverse_Algorithm {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        Rotate(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        //Starting ke n-k element reverse
        reverse(arr,0,n-k-1);
        //last ke k element reverse
        reverse(arr,n-k,n-1);
        //reverse full element
        reverse(arr,0,n-1);
    }
    public static void reverse(int[] array,int i,int j  ) {
        while (i<j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}
