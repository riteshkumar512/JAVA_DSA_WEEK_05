package Assignment_04;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_of_Roses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T= sc.nextInt();
        while (T-->0){
            int N=sc.nextInt();//No. of flower
            int[] Price=new int[N];
            for (int i = 0; i < Price.length; i++) {
                Price[i]= sc.nextInt();
            }
            int M=sc.nextInt();//total money(target)
            Rosepair(Price,M);
        }
        System.out.println();


    }
    public static void Rosepair(int[] Price,int target){
        Sort(Price);
        int minDiff=Integer.MAX_VALUE;
        int ans1=0;
        int ans2=0;

        for (int i = 0; i < Price.length; i++) {
            for (int j = i+1; j < Price.length; j++) {
                if (Price[i]+Price[j]==target){
                    int diff=Price[j]-Price[i];

                    if (diff<minDiff){
                        minDiff= diff;
                        ans1=Price[i];
                        ans2=Price[j];
                    }
                }
            }
        }
        System.out.println("Deepak should buy roses whose prices are "+ ans1 +" and "+ ans2 +".");

    }
    public static void Sort(int[]arr){
        for (int i = 1; i < arr.length; i++) {
            InsertlastElem(arr,i);
        }
    }
    public static void InsertlastElem(int[] arr,int i){
        int item=arr[i];
        int j=i-1;
        while (j>=0 && arr[j]>item){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=item;
    }
}
