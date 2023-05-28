package com.interitance;


class Base {
    protected  void getInfo()
    {
        System.out.println("Base class method");
    }


}
public class protected1 extends Base {
    protected  void getInfo()
    {
        System.out.println("protected method invoked");
    }

    public static void main(String[] args) {
        Base obj =new Base();
        obj.getInfo();

    }

}

