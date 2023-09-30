package com.Exercise;
/*\
A Narcissistic Number (or Armstrong Number) is a positive number which is the sum of its own digits,
each raised to the power of the number of digits in a given base.
In this Kata, we will restrict ourselves to decimal (base 10).*/

public class NumberUtils {


    public static boolean isNarcissistic(int number){
        int length=0;
        int temp=number;
        while(temp>0){
            length++;
          //  System.out.println("Temp/"+temp+"length"+length);
            temp=temp/10;
        }

        temp=number;
        int sum=0;
        while(temp>0) {
            int d= temp%10;
            System.out.println("d after%10:"+d);
            sum += Math.pow(d, length);
            System.out.println("Sum at each step:"+sum);
            temp=temp/10;
            System.out.println("Temp after/10:"+temp);


        }

      return sum==number;
    }

    public static void main(String[] args) {
        int number=153;
        System.out.println(isNarcissistic(number));

    }

}
