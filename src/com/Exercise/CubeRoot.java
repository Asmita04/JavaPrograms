package com.Exercise;
//Finding Cube root of any number

import java.util.Scanner;

public class CubeRoot {
    static int CbRoot(int num){
        int temp;
        for(int i=1;i<num/2;i++){
            temp= num/i;

            if(temp == i*i)
            {
                System.out.println("i:"+i);
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

        System.out.println("Cube root"+ CbRoot(num1));



    }
}
