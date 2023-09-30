package com.Exercise;

class GrandParent {
    public int sum=0;
    private int sump=0;
    protected int sumpr=0;
}
class Parent1 extends GrandParent{
    Parent1 p=new Parent1();
    public void method(){
     //   p.sum;
       // p.sumpr;

    }

}





public class AccessModifier extends Parent1{
    public static void main(String[] args) {

    AccessModifier a=new AccessModifier();
   // a.sumpr;
    //a.sum;
    }
}
