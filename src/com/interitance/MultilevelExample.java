package com.interitance;

class A{

    public A() {
        System.out.println("A constructor");
    }

}

class B extends A{
    public B()
    {   {

        System.out.println("Instance block");
    }
        System.out.println("B constructor");

    }

}

class C extends B{
    public C()
    {

        System.out.println("C constructor");

    }


}
public class MultilevelExample {
    public static void main(String[] args) {
        B obj=new C();


    }
}
