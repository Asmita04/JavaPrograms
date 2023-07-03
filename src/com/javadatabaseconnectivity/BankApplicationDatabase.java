package com.javadatabaseconnectivity;

import java.sql.*;
import java.util.Scanner;

class BankApplicationDatabase{

    public static void main(String args[]) throws Exception{

        Class.forName("org.sqlite.JDBC");


        Connection con= DriverManager.getConnection("jdbc:Sqlite:C://Sqlite//BankApplication.db");

        PreparedStatement stm= con.prepareStatement("select accountNo,userName,balance from Accounts where accountNo=?");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter accountNo?");
        String accountNo=scan.nextLine();

        stm.setString(1,accountNo);
        ResultSet rs= stm.executeQuery();

        //  ResultSet rs= stm.executeQuery("select * from Accounts");

        while(rs.next())
        {
         //   accountNo=rs.getString("accountNo");
           // username=rs.getString("username");
            //balance=rs.getInt("balance");
            System.out.print(rs.getString("accountNo")+"  ");
            System.out.print(rs.getString("userName")+"  ");
            System.out.print(rs.getInt("balance")+"  ");

            //  System.out.println(accountNo+" "+username+" "+balance);

        }



    }
}