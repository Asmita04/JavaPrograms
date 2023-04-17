package com.Exercise;
import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
                System.out.print("*");
           System.out.println("\n");
        }
    }
}
