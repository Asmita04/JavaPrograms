package com.Exercise;

//import org.w3c.dom.ls.LSOutput;


//class Super1 {
//    public int A;
//    public int B;
//
//    public Super1()
//    {
//
//        System.out.println("Non param of Super");
//    }
//    public Super1(int A,int B)
//    {
//
//        System.out.println("parametrised of super");
//    }
//
//}*/
class Animal{
    String color="white";


}
class Dog extends Animal{
    String color="black";

    void printColor(){
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }
}
public class Super{
    public static void main(String[] args){
        Dog d=new Dog();
        d.printColor();
    }
}

/*}

    class sub extends Super1{
    int c;
    public sub()
    {
        System.out.println("Non parametrised of sub class");
    }
    public sub(int c)
    {
        super(4,8);
        System.out.println("parametrised of sub");
    }
}
public class Super{
    public static void main(String[] args){

    sub obj =new sub(5);




    }
}*/