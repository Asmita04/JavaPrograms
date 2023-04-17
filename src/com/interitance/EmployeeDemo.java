package com.interitance;
import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        //Instantiating object of class person
        Employee P1=new Employee();
       // Person P1=new Person();
           System.out.println("Enter name of the person");
           P1.Name=scan.nextLine();

           System.out.println("Enter Date of birth");
           P1.DateOfBirth=scan.nextLine();

           System.out.println("Enter Age of person:");
           P1.Age=scan.nextInt();

           scan.nextLine();
           System.out.println("Enter Department:");
           P1.Department=scan.nextLine();

           System.out.println("Enter salary:");
           P1.salary= scan.nextInt();
           P1.display();





    }
}
