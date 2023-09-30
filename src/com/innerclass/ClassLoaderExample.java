package com.innerclass;
class ParentLoader{
    ParentLoader(){

    }
    public void Display(){
        System.out.println("Parent class Loader");
    }

}

public class ClassLoaderExample  extends ParentLoader{
    public static void main(String[] args) throws Exception{
        ClassLoader loader=String.class.getClassLoader();
        //System.out.println(loader.getClass());
        System.out.println(loader.getParent());
        //System.out.println(loader.getResources(loader));
    }
}
