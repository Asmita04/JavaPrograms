package com.interitance;

import java.util.ArrayList;
import java.util.List;

public class ShapeDemo {
    public static void main(String[] args) {

        // Parent ref = parent/sub-class object
        // Shape shape = new Circle(1);
    //  Shape shape =new Shape();                //Interface cannot be instantiated

      // List<Shape> shapeList = new ArrayList<Shape>();
       //System.out.println(shapeList.isEmpty());
      // Circle C1=new Circle(1);             //Class should implement all the methods defined in the interface
     //  System.out.println(C1.area());
      // System.out.println(C1.perimeter());
// E:\JavaPrograms
        Square sq=new Square(1);
        System.out.println("Area:"+sq.area());
        System.out.println("Perimeter:"+sq.perimeter());
        System.out.println(sq.method2());
        System.out.println(sq.method1());







    }




}
