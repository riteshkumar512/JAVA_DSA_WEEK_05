package Assignment_04;

import java.util.Scanner;

public class Von_Neuman_Loves_Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        int[] arr=new int[N];
        for (int i=0;i< N;i++){
            arr[i]= sc.nextInt();
        }
        BinaryToDecimal(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }

        public static void BinaryToDecimal(int[] num ){

            for (int i = 0; i < num.length; i++) {
                int sum=0;
                int mul=1;
                int value=num[i];
                while (value > 0) {
                    int rem = value % 10;
                    sum += rem * mul;
                    value = value / 10;
                    mul = mul * 2;
                    num[i]=sum;
                }
            }
        }
    }

