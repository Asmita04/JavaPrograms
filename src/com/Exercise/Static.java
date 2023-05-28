package com.Exercise;

public class Static {
    static int a;

    {
        System.out.println("Static block!");
    }

        void display ()
        {
           main(null);
            System.out.println("Hey!");
        }



    public static void main(String[] args) {
        a=20;
        //a=10;
        final int A=20;
        final int C=20;
        System.out.println("Value is "+ (A+C));
      //  System.out.println(a);

    }

}
