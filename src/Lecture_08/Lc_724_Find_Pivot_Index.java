package Lecture_08;

public class Lc_724_Find_Pivot_Index {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        int result=pivot_index(arr);
        System.out.println(result);

    }
    public static int pivot_index(int [] arr){
        int n= arr.length;

        //prefix
        int[] left=new int[n];
        left[0]=0;
        for (int i=1;i<=n-1;i++){
            left[i]=left[i-1]+arr[i-1];
        }
        //suffix
        int[] right =new int[n];
        right[n-1]=0;
        for (int i=n-2;i>=0;i--){
            right[i]=right[i+1]+arr[i+1];
        }
        //calculation
        for (int i=0;i<=n-1;i++) {
            if (left[i] == right[i]) {
                return i;
            }
        }

        return -1;
    }

}
