package com.innerclass;

//Local inner class
public class OuterClass {
    public void display(){
        class InnerClass{
            public void show(){
                System.out.println("Inner class Show");
            }

        }
        InnerClass ic=new InnerClass();
        ic.show();

    }

    public static void main(String[] args) {
        OuterClass outer=new OuterClass();
        outer.display();
    }
}

