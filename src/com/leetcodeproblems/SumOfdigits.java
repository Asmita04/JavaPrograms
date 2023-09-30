package com.leetcodeproblems;

/*
* Given n, take the sum of the digits of n. If that value has more than one digit,
 continue reducing in this way until a single-digit number is produced.
* The input will be a non-negative integer.
*  16  -->  1 + 6 = 7
*  942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
* */

public class SumOfdigits {
    public static int digitalRoot(int number){
        int temp=number;

        while(temp>0){
            System.out.println("Temp"+temp);
        }
        return 0;
    }
    public static void main(String[] args) {

        int number=942;
        System.out.println(digitalRoot(number));



    }
}
