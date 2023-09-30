package com.Exercise;

import java.util.stream.Stream;
class DemoSuper  {
    DemoSuper(){
        System.out.println("Super ka default");
    }

}
class DemoChild extends DemoSuper{

    public DemoChild() {
    }
    public DemoChild(int x){

        super();

        System.out.println("DemoChild constructor called");
    }
}

public class StreamDemo {
    public static void main(String[] args) {

        Stream<String> stream= Stream.of(
                "Asmita","Mhetre"
        );
        stream.forEach(System.out::println);
        DemoChild obj = new DemoChild(5);

    }



}
