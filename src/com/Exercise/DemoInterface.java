package com.Exercise;

interface shape{
default void method1(){
    System.out.println("Hello!");
}

}

public class DemoInterface {
    public static void main(String[] args) {
        shape s = null; //Throw null pointer exception
try{
    s.method1();


}catch(Exception e){
    System.out.println(e);

}

    }
}
