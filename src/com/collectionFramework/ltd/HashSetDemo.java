package com.collectionFramework.ltd;
import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
       HashSet<String> set1= new HashSet<String>(10);
        set1.add("a");
        set1.add("k");
        set1.add("d");
        set1.add("c");
        set1.add("b");

        System.out.println("size is:"+set1.size());
        System.out.println(set1);


   //     set1.forEach(System.out::println);

      /*  HashSet<ArrayList> set = new HashSet<ArrayList>();
        ArrayList<Integer>  list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(5);
        list1.add(2);
        list2.add(1);
        list2.add(6);
       // list2.add(2);
        set.add(list1);
        set.add(list2);
        System.out.println(set);
        set.clone();
       // set.remove(list1);

        //Printing HashSet
        //Using Iterator
        Iterator<ArrayList> it= set.iterator();
        while(it.hasNext()){
            it.next();
            }

        //Direct method
        System.out.println(set);

        HashSet<Employee> set2=new HashSet<Employee>();

        Employee E1 =new Employee("S5610","Suhani",51000);
        set2.add(E1);

        System.out.println(E1);




*/

    }
}
