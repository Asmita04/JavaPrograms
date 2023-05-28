package com.collectionFramework.ltd;

import java.util.*;

public class ArrayListDemo {

    static int a;
    {
        a=50;
    }



    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<Integer>(5);
        obj.add(1);
        obj.add(2);
        obj.add(4);
        obj.add(7);
        obj.add(10);
        obj.add(11);
        System.out.println("First list:");
        System.out.println(obj);
       // System.out.println(obj.size());
        //obj.addAll(5,4);


       // obj.addAll


        ArrayList<Integer> list2=new ArrayList<Integer>();
        list2.add(2);
        list2.add(12);
        list2.add(13);
        list2.add(4);
        list2.add(11);

        Iterator<Integer> it = list2.iterator();
        System.out.println("Second list:");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
       // list2.removeAll(obj);


      // ArrayList<Integer> obj2=new ArrayList<Integer>(List.of(4,5,6,7,8));
       /* for(Integer X: obj  )
        {
            System.out.println(X);
        }*/
   //     System.out.println(obj.isEmpty());

    }
}
