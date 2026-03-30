package Assignment_04;

import java.util.Scanner;

public class Alex_Goes_Shopping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int q= sc.nextInt();
        while (q>0){
            int A= sc.nextInt();//Amount
            int k= sc.nextInt();//Shopkeeper
            queryResult(arr,A,k);
            q--;

        }

    }
    public static void queryResult(int[] arr,int A,int K){
//        int amount=A;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (A % arr[i]==0){
                count++;
            }
        }
            if (count>=K){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }


    }
}
