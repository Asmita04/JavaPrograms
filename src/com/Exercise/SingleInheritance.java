package com.Exercise;


 class circle{
     public int radius;

     public double area()
     {
         return Math.PI*radius*radius;
     }

     public  double perimeter()
     {
        return 2*Math.PI*radius;
     }

}

 class cylinder extends circle{
     public int height;

     public double area()
     {
         return perimeter()*height+  perimeter()*radius;
     }

     public double volume()
     {
         return area()*radius;
     }
}

public class SingleInheritance {

    public static void main(String[] args)
    {
        cylinder c1=new cylinder();
        c1.radius=7;
        c1.height=10;

        System.out.println("Cylinder Area:"+ c1.area());
        System.out.println("Cylinder Volume"+c1.volume());


    }

}
