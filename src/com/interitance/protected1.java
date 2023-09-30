package com.interitance;


class Base {
    String Name;
    private String ID="10";
    public String City="Pune";
    void method(){
        System.out.println("Base class public method!");
    }
     protected  void getInfo()
    {
        System.out.println("Name:"+this.Name+" "+"ID:"+this.ID);
    }
    Base(String Name,String ID){
        this.ID=ID;
        this.Name=Name;
    }
}

public class protected1 {

    public static void main(String[] args) {

//        -------------------------------------------
//                  //  Base  base;
//
//                     String name = base.Name;
//                     base.getInfo();
//                     base.method();
//         ------------------------------------------------------

                Base base= new Base("Asmita","411");
                String Name=base.Name;
                String City=base.City;
                base.getInfo();

    }

}

