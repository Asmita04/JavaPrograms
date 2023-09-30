package com.interitance;

class A{
    static {
        System.out.println("A Static block!");
    }
    {
        System.out.println("A Instant block!");
    }

    public A() {
        System.out.println("A constructor");
    }

}

class B extends A{
    static {
        System.out.println("Static  b block!");
    }
    {
        System.out.println("Instance init block!");
    }
    public B(){
        System.out.println("B Constructor!");
    }

}

//class C extends B{
//    public C()
//    {
//
//        System.out.println("C constructor");
//
//    }
//
//
//}
public class MultilevelExample {
    public static void main(String[] args) {
        B c = new B();



    }
}
