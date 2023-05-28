package com.collectionFramework.ltd;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        map.put(166,"China");
        System.out.println(map);

        HashMap<String,Employee> map1 =new HashMap<String, Employee>();
        Employee E1 = new Employee("116","Asmita",5608000);
        Employee E2 = new Employee("118","Asmita",5608000);
        Employee E3 = new Employee("119","Asmita",5608000);
        Employee E4 = new Employee("112","Asmita",5608000);

        map1.put(E1.getEmpid(),E1);
        map1.put(E2.getEmpid(), E2);
        map1.put(E3.getEmpid(), E3);
        map1.put(E4.getEmpid(), E4);

      //  map1.remove("119");

        //map1.remove("119","Asmita",5608000);
        System.out.println( map1.keySet());


    }
}
