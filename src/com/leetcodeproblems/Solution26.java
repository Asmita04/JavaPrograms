package com.leetcodeproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//Removing duplicates from sorted array

public class Solution26 {
    static void printArray(){

    }
    public int removeDuplicates(int[] nums) {


        return 0;
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int size = scan.nextInt();
        int[] arr = new int[size];
        int[] res = new int[size];

        for(int i=0;i<size;i++){
            System.out.print("arr["+i+"]=");
            arr[i] = scan.nextInt();
        }

      /* for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate found at:"+i);
                   // arr[j-1]=arr[j];

                }
            }
        }*/
//        int k=0;
//        for(int i=0;i<size-1;i++){
//            if(arr[i]!=arr[i+1]){
//                res[k++]=arr[i];
//            }
//            res[k++]=arr[size-1];
//        }3
//
//        System.out.println("k value:"+k);
//        for(int i=0;i<k;i++){
//            arr[i]=res[i];
//        }
        System.out.println("Arrays class");
        Arrays.sort(arr);
        for(int i=0;i<size;i++){
            System.out.print(res[i]+",");
        }
    }
}
