package com.loginon.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
	private static final String URL = "jdbc:mysql://localhost:3306/user_info";
	 private static final String USERNAME = "root";
	 private static final String PASSWORD = "Lunatic@2554*#";
	 static {
	        try {
	            // Load the MySQL JDBC driver
	            Class.forName("com.mysql.cj.jdbc.Driver");
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }

	    public static Connection getConnection() throws SQLException {
	        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	    }
	

}
