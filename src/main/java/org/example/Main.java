package org.example;

import java.sql.*;

public class Main {
    public  static Connection getConnection()throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/c2","root","root");

        System.out.println(con);
        Statement s=con.createStatement();
        ResultSet r=s.executeQuery("select * from company");
        while (r.next())
        {
            System.out.println(r.getString(1)+" "+r.getString(2));
        }
        return con;
    }
    public static void main(String[] args) throws SQLException {
       // System.out.println("Hello world!");
       // System.out.println(con);
        //Connection con = getConnection();
        Main m=new Main();
        getConnection();
    }
}