package com.th.mainpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
    	 Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","Serengeti2948$$");
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery("select * from departments");
         ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
         System.out.println("Total no, of colums:"+rsmd.getColumnCount());
         
         System.out.println("Coloum name  of 1st coloum:"+rsmd.getColumnName(1));
         System.out.println("Coloum name  of 1st coloum:"+rsmd.getColumnTypeName(1));
         
         
    }
}
