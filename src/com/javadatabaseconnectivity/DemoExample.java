package com.javadatabaseconnectivity;
import java.sql.*;
import java.util.Scanner;

//Prepared Statement Example
public class DemoExample {
    public static void main(String[] args) throws Exception{

        Class.forName("org.sqlite.JDBC");

        Connection con=DriverManager.getConnection("jdbc:Sqlite:C://Sqlite//univ.db");

//        Statement stm= con.createStatement();

        PreparedStatement stm = con.prepareStatement("select * from students where rollno=?");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Roll No:");
        int rollno=sc.nextInt();

        stm.setInt(1,rollno);

        ResultSet rs= stm.executeQuery();

   //     ResultSet rs=stm.executeQuery("Update students set name='Ajay Mhetre' where name='Ajay' ");


        String name;

        while(rs.next()){
            rollno=rs.getInt(1);
            name=rs.getString(2);
            System.out.println(rollno+" |"+name);
        }






    }
}
