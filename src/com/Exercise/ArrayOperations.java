package com.Exercise;


//Removing an element from an array

import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
        int[] arr= new int[5];
        Scanner scan =new Scanner(System.in);;

        for(int i=0;i<arr.length;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i]=scan.nextInt();
        }

        System.out.println("Enter which Position you wanted to delete:");
        int pos=scan.nextInt();

        for(int i=pos;i<arr.length-1;i++){
            System.out.println("pos"+pos+"\t arr[pos] "+arr[pos]);
            arr[i]=arr[i+1];
        }

        for(int i=0;i<arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
