package com.interitance;

public class Square extends Rectangle implements Shape,Shape1{
    final private double  Side;
    public Square(double Side)
    {
        this.Side=Side;
    }

    @Override
    public double area() {
        return Side*Side;
    }
    @Override
    public double  perimeter() {
        return (4*Side);
    }

    @Override
    public String method1() {
        System.out.println("This is method1 !");

        return null;
    }
}
