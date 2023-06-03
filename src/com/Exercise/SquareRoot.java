package com.Exercise;

import java.util.Scanner;

//Finding the square root of number
public class SquareRoot {


    static int Sqrt(int num){
        int temp;
        for(int i=1;i<num/2;i++){
            temp= num/i;

            if(temp == i)
            {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int num1;
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter  number:");
        num1=scan.nextInt();

        System.out.println( Sqrt(num1));


    }
}
