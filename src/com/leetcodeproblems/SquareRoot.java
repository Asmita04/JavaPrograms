package com.leetcodeproblems;

public class SquareRoot {
    public int mySqrt(int x) {

        int result=(int) Math.floor(Math.sqrt(x));



        return result;
    }
        public static void main(String[] args) {

        int num=4;
        SquareRoot obj=new SquareRoot();
        int value =obj.mySqrt(num);
        System.out.println(value);


    }
}
