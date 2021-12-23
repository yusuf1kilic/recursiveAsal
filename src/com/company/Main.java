package com.company;

import java.util.Scanner;

public class Main {
    public static int asal(int i,int num){
        if (num==i){
            return 0;
        }else if (num%i==0){
            return 1;
        }else {
            return asal(i+1,num);
        }
    }


    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("lütfen bir sayı giriniz : ");
        int number1= input.nextInt();
        if (asal(2,number1)==0){
            System.out.println(number1+" : bu bir asal sayıdır");
        }else{
            System.out.println(number1+" : bu bir asal sayı değildir");
        }
    }
}
