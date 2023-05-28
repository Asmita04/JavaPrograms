package com.collectionFramework.ltd;

import java.util.*;


public class Demo {


    public static void main(String[] args) {

        List<Employee> list =new LinkedList<Employee>();

        Employee emp1= new Employee("S542","Archana",50000);
        Employee emp2= new Employee("S512","Asmita",10000);


        list.add(emp1);
        list.add(emp2);

        System.out.println(list);


        Map< String,Employee> empMap =new HashMap<String, Employee>();
        Employee emp3= new Employee("S542","Archana",50000);

        empMap.put(emp3.getEmpid(),emp3);

        Employee e =empMap.get(emp3.getEmpid());


        System.out.println(empMap);





    }

}
