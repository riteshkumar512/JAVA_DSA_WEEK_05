package Assignment_04;

import java.util.Scanner;

public class Von_Neuman_Loves_Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        for (int i=0;i< N;i++){
            int num= sc.nextInt();
            BinaryToDecimal(num);
        }
    }

        public static void BinaryToDecimal(int num ){
            int sum=0;
            int mul=1;
            while (num>0){
                int rem=num%10;
                sum+= rem* mul;
                num=num/10;
                mul=mul*2;
            }
            System.out.println(sum);
        }
    }

