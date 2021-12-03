package com.th.bookdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	
	private static Connection con;
	
	public static Connection getConnection() throws SQLException {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Drivers");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstoredb","root","Rajuraju@1");
		}catch(ClassNotFoundException e){
			
			e.printStackTrace();
			
		}
		return con;
			
	}

}
