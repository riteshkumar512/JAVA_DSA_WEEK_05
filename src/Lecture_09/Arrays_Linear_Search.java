package Lecture_09;

import java.util.Scanner;

public class Arrays_Linear_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int item=sc.nextInt();
        System.out.println(linearSearch(arr,item));
    }
    public static int linearSearch(int[] arr,int item){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==item){
                return i;
            }
        }
        return -1;
    }
}
