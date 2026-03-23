package Assignment_04;

import java.util.Scanner;

public class Majority_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println(Majority(arr));
    }
    public static int Majority(int[] arr){
        int e=arr[0];
        int vote=1;
        for (int i = 1; i < arr.length; i++) {
            if (e==arr[i]){
                vote++;
            }else {
                vote--;

            }
            if (vote==0){
                vote++;
                e=arr[i];
            }
        }
        return e;
    }
}
