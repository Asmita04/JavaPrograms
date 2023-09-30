package com.javadatabaseconnectivity;

import java.sql.*;
import java.util.Scanner;


class BankApplicationDatabase{

    public static void main(String args[]) throws Exception{

        Class.forName("org.sqlite.JDBC");


        Connection con= DriverManager.getConnection("jdbc:Sqlite:C://Sqlite//BankApplication.db");

      //  Statement stm = con.createStatement();

      PreparedStatement stm= con.prepareStatement("INSERT INTO Accounts (accountNo,username,birthDate,mobileNo,adhaarNo,balance ) VALUES (?,?,?,?,?,?)");

      Scanner scan = new Scanner(System.in);
     System.out.println("Enter accountNo?");
     String accountNo=scan.nextLine();
     stm.setString(1,accountNo);

     System.out.println("Enter username?");
     String username=scan.nextLine();
     stm.setString(2,username);

    System.out.println("Enter birthDate?");
    String birthDate=scan.nextLine();
    stm.setString(3,birthDate);

    System.out.println("Enter mobileNo?");
    String mobileNo=scan.nextLine();
    stm.setString(4,mobileNo);

    System.out.println("Enter adhaarNo?");
    String adhaarNo=scan.nextLine();
    stm.setString(5,adhaarNo);

    System.out.println("Enter balance?");
    String balance=scan.nextLine();
    stm.setString(6,balance);


    stm.executeUpdate();
    stm.close();
    con.close();


//        ResultSet rs=stm.executeQuery();
//        while(rs.next()){
//            System.out.println(rs.getString(1)+" "+rs.getString(2)+ " "+rs.getString(3)+"| "+rs.getString(4)+" |"+rs.getString(5)+" |"+rs.getInt(6));
//        }





        /*
        PreparedStatement pstmt=con.prepareStatement("select * from Accounts");

        ResultSet  rs=pstmt.executeQuery();


        ResultSetMetaData rsmd=rs.getMetaData();



           // accountNo=rs.getString("accountNo");
            System.out.println("Total columns: "+rsmd.getColumnCount());
            System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  //accountNo
            System.out.println("Column Name of 2st column: "+rsmd.getColumnName(2));  // username
            System.out.println("Column Name of 3st column: "+rsmd.getColumnName(3));   //birthDate
            System.out.println("Column Name of 4st column: "+rsmd.getColumnName(4));    //mobileNo
            System.out.println("Column Name of 5st column: "+rsmd.getColumnName(5));    //adhaarNo
            System.out.println("Column Name of 6st column: "+rsmd.getColumnName(6));    //balance





*/
    }
}