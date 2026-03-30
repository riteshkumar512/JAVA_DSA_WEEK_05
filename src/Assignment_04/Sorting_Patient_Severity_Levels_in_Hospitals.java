package Assignment_04;

import java.util.Scanner;

public class Sorting_Patient_Severity_Levels_in_Hospitals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]= sc.nextInt();
        }
    Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }

    }
    public static void Sort(int[] arr){
       int low=0;
       int last= arr.length-1;
       int i=0;
       while (i<=last){
           if (arr[i]==0){
               int temp=arr[i];
               arr[i]=arr[low];
               arr[low]=temp;
               i++;
               low++;
           }
           else if (arr[i]==2){
               int temp=arr[i];
               arr[i]=arr[last];
               arr[last]=temp;
               last--;
           }
           else {
               i++;
           }
       }
    }
}
