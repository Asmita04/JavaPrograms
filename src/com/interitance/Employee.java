package com.interitance;

//Single inheritance
public class Employee extends Person {

    public String Department;
    int salary;

    //Parametrised constructor
    public Employee(String department, int salary) {
        this.Department = department;
        this.salary = salary;
    }

    public Employee() {
        Department="Unknown";
        salary = 0;
    }

    //Getter setter methods
    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void display()
    {
        System.out.println("Name:"+Name+"DateOfBirth:"+DateOfBirth+"Age:"+Age);
        System.out.println("Employee Department:"+Department+"Salary:"+salary);
    }
}
