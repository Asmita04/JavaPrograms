package com.Exercise;

//Swap two numbers without using third variable

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int num1=0 ,num2=0;
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter First number:");
        num1=scan.nextInt();

        System.out.println("Enter Second number:");
        num2=scan.nextInt();


        num1= num1+num2;
        num2 = num1-num2;

        num1= num1-num2;
        System.out.println("After swap:");

        System.out.println("First number:"+num1);
        System.out.println("Second number:"+num2);



    }
}
