package Lecture_08;

public class Lc_2574_Left_and_Right_Sum_Differences {
    public static void main(String[] args) {
    int [] arr= {10, 4, 8, 3};
    int[] print=arrayDifference(arr);
    for(int i=0;i<arr.length;i++){
        System.out.print(print[i]+" ");
    }
    }
    public static int[] arrayDifference(int[] arr){
        int n=arr.length;
        //prefix
        int [] left=new int[n];
        left[0]=0;
        for (int i=1;i<=n-1;i++){
            left[i]=left[i-1]+arr[i-1];
        }
        //suffix
        int[] right=new int[n];
        right[n-1]=0;
        for (int i=n-2;i>=0;i--){
            right[i]=right[i+1]+arr[i+1];
        }
        //calculation
        int[] result=new int[n];
        for (int i=0;i<=n-1;i++){
        result[i]=Math.abs(left[i]-right[i]);
        }
        return result;
    }
}
