package com.javadatabaseconnectivity;

import java.sql.*;
import java.util.Scanner;

public class Exmaple1 {
    public static void main(String[] args) throws Exception{

        Class.forName("org.sqlite.JDBC");

        Connection con= DriverManager.getConnection("jdbc:Sqlite:C://Sqlite//univ.db");

        PreparedStatement stm=con.prepareStatement("select * from dept where deptno=?");

        Scanner scan=new Scanner(System.in);

        System.out.println("enter dept no:");
        int deptno = scan.nextInt();
        stm.setInt(1,deptno);
        ResultSet rs= stm.executeQuery();


        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }


    }
}
