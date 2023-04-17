package com.interitance;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

   @Override
    public double perimeter() {
        return Math.PI * radius * 2;
    }

}
