package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
//	static {
//		try {
//			// Load the SQLite JDBC driver
//			Class.forName("org.sqlite.JDBC");
//		} catch (ClassNotFoundException e) {
//			throw new RuntimeException("SQLite JDBC driver not found", e);
//		}
//	}
//	public static Connection getConnection() throws SQLException {
//		String url = "jdbc:sqlite:BuddyFinder.db";
//		Connection con = DriverManager.getConnection(url);
//		return con;
//	}
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306";
		String user = "root";
		String pass = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,user,pass);
		return con;
	}
}
