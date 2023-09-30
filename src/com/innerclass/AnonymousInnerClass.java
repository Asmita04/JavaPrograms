package com.innerclass;

import com.interitance.Shape;

public class AnonymousInnerClass {

    public static void main(String[] args) {
        Shape obj=new Shape() {
            @Override
            public double area() {
                System.out.println("Area!");
                return 0;
            }

            @Override
            public double perimeter() {
                System.out.println("perimeter!");
                return 0;
            }
        };



    }
}
