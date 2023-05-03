package JavaCollections;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<Integer>(10);
        obj.add(1);
        obj.add(2);
        //obj.addAll(5,4);


       // obj.addAll
       // ArrayList<Integer> obj2=new ArrayList<Integer>(List.of(4,5,6,7,8));
        for(Integer X: obj  )
        {
            System.out.println(X);
        }
        System.out.println(obj.isEmpty());

    }
}
