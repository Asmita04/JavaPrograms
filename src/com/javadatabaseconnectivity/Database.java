package com.javadatabaseconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//DML

public class Database {
    public static void main(String[] args) throws Exception {

        Class.forName("org.sqlite.JDBC");

        Connection con= DriverManager.getConnection("jdbc:Sqlite:C://Sqlite//univ.db");

        Statement stm=con.createStatement();

        //stm.executeUpdate("insert into dept values(70,'Electrical')");
        stm.executeUpdate("delete  from dept where deptno=60");

    }
}
