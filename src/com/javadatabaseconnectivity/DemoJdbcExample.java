package com.javadatabaseconnectivity;



import java.sql.*;
import java.util.*;

public class DemoJdbcExample {

    public static void main(String[] args) throws Exception{

        Class.forName("org.sqlite.JDBC");

        Connection con= DriverManager.getConnection("jdbc:Sqlite:C://Sqlite//univ.db");

     //   Statement stm=con.createStatement();

     //   PreparedStatement stm=con.prepareStatement("select * from students where roll=?");

        PreparedStatement pstm =con.prepareStatement("select roll,name from students where rollNo=?");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name is :");
        int   rollno = sc.nextInt();
        pstm.setInt(1,rollno);
      //  ResultSet rs=stm.executeQuery("select * from students");

        ResultSet rs=pstm.executeQuery();

        String name;
        while (rs.next()){
         //   System.out.println(rs.getInt("roll")+" ");
           // System.out.println(rs.getString("name")+" ");
            rollno=rs.getInt(1);
            name=rs.getString(2);
            System.out.println(rollno+"|"+name);
        }
        pstm.close();
        con.close();
    }
}
