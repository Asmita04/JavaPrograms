package com.javadatabaseconnectivity;

import java.sql.*;

//ResultSetMetaData

public class DatabaseDemo {
    public static void main(String[] args) throws Exception{

        Class.forName("org.sqlite.JDBC");

        Connection  con=DriverManager.getConnection("jdbc:Sqlite:C://Sqlite//univ.db");

        PreparedStatement stm= con.prepareStatement("select * from dept");

        ResultSet rs=stm.executeQuery();

        ResultSetMetaData rdata=stm.getMetaData();

      /*  while(rs.next()){
            System.out.println(rs.getInt(1)+" |"+rs.getString(2));
        }*/

        System.out.println("Total columns:"+rdata.getColumnCount());
        System.out.println("1st Column name:"+rdata.getColumnName(1));
        System.out.println("2nd column name:"+rdata.getColumnName(2));
        System.out.println("1st column type:"+rdata.getColumnTypeName(1));
        System.out.println("2nd column type:"+rdata.getColumnTypeName(2));

    }
}
