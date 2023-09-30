package com.Exercise;

 class Parent {

    private int sum=5;
    public int sump=10;
    protected int sumpr=15;

}

public class Name extends Parent{
     public int sump=89;
//     super.sump;
    public static void main(String[] args) {
        Parent p = new Parent();

    }
}

 class Child2 extends Name{

     Parent p2 = new Parent();


}

