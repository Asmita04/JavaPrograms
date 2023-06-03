package com.Exercise;

//26. Remove Duplicates from Sorted Array

import java.util.Scanner;

public class RemoveDuplicate {
    static public int removeDuplicate(int[] num) {
        int key;
        for(int i=0;i<num.length;i++){
             key= num[i];
             for(int j=i+1;j< num.length-1;j++){
                 if(key==num[j]){
                     num[i]=num[i+1];
                 }
             }
        }

        return 0;

    }

    public static void main(String[] args) {
        int[] arr= new int[8];
        Scanner scan =new Scanner(System.in);;

        for(int i=0;i<arr.length;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i]=scan.nextInt();
        }

        System.out.println(removeDuplicate(arr));

    }
}
