package com.interitance;

public class Rectangle implements Shape {
    //All fields are by default static and final

    private final double length;
    private final double width;

    public Rectangle()
    {
        length=0;
        width=0;
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);
    }

    public String method2()
    {
        System.out.println("This is Rectangle class method2");
        return null;
    }
}
