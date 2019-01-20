package com.itsm.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyDemo {

public static void main(String[] args) {
	
	
	Connection connection = JdbcUtil.getConnection();
	String  sql="";
	PreparedStatement statement=null;
	ResultSet executeQuery=null;
	try {
		statement = connection.prepareStatement(sql);
		 executeQuery = statement.executeQuery();
		 
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	System.out.println(connection);
	
}	
	
	
	
}
