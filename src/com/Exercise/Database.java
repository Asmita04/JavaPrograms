package com.Exercise;
import java.sql.*;

class Database {
    public static void main(String[] args) throws Exception {
        {
            Class.forName("org.sqlite.JDBC");

            Connection con = DriverManager.getConnection("jdbc:Sqlite:C://Sqlite//univ.db");

            Statement stm = con.createStatement();

            //    stm.executeUpdate("create table Accounts(accountno integer primary key not null, username String , MobileNo Long,AdhaarNo String,BirthDate String ");

            ResultSet rs = stm.executeQuery("select * from dept");

            int deptno;
            String dname;
            while (rs.next()) {
                deptno = rs.getInt("deptno");
                dname = rs.getString("dname");

                System.out.println(deptno + " " + dname);

            }

        }
    }
}