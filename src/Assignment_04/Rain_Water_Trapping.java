package Assignment_04;

import java.util.Scanner;

public class Rain_Water_Trapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-- >0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(TrappingWater(arr));
        }

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
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=Math.min(left[i],right[i])-arr[i];
        }
        return sum;
    }
}
