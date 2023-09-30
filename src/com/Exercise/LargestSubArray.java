package com.Exercise;
//Google interview round
// Given an array of integers, write a function that finds the contiguous subarray with the largest sum and returns the sum.
//Kadane's Algorithm

import java.util.Scanner;

public class LargestSubArray {
    int Max_Sum=Integer.MIN_VALUE,Curr_sum=0;

    public int maxSubArray(int[] arr) {
        System.out.println("MAx_sum"+Max_Sum);
        for (int i = 0; i < arr.length; i++) {
                Curr_sum = Curr_sum + arr[i];
                if (Curr_sum > Max_Sum) {
                    Max_Sum = Curr_sum;
                }
                if (Curr_sum < 0) {
                    Curr_sum = 0;
                }

            }
        return Max_Sum;
    }

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int size = scan.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            System.out.print("arr["+i+"]=");
            arr[i] = scan.nextInt();
        }
        LargestSubArray lsb = new LargestSubArray();
        int temp=lsb.maxSubArray(arr);
        System.out.println(temp);


    }
}
