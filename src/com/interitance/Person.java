package com.interitance;

import java.util.Date;

public class Person  {

    public String Name;
    public String DateOfBirth;
    public int Age;

    //Default
    public Person(){
        Name = "NA";
        DateOfBirth = "1/1/2000";
        Age = 0;
        System.out.println("Non Parametrised call!");
    }

    //Parametrised constructor

    public Person(String name, String dateOfBirth, int age) {
        Name = name;
        DateOfBirth = dateOfBirth;
        Age = age;
    }


    //Setter and getter methods

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }


}
