package Lecture_09;

public class Lc_11_MaximumTrappingWater {
    public static void main(String[] args) {

    }
    public static int TrappingWater(int[] arr){
        int n= arr.length;
        //prefix
        int [] left=new int[n];
        left[0]=arr[0];
        for (int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        //suffix
        int[] right=new int[n];
        right[n-1]=arr[n-1];
        for (int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }
        //calculation
        return  left.length;
    }
}
