package com.generics;

public class Demo<T>{
     T[] data =(T[]) new Object[3];
    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.data[0]="First";
        obj.data[1]="Second";
        obj.data[2]=5;

        for( int i=0;i<3;i++){
            System.out.println(obj.data[i]);
        } 


    }
}
