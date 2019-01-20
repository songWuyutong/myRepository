package com.itsm.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class JdbcUtil {	
	
public static final String url="jdbc:mysql://localhost:3306/demo";
public static final String password="root";
public static final String username="root";

	
	
	
static {
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}	
	
public static  Connection  getConnection() {
	Connection conn=null;
	
	try {
		conn = DriverManager.getConnection(url, username, password);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return conn;
}

	
}
