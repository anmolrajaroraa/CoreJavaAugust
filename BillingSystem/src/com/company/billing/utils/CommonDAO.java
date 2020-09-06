package com.company.billing.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CommonDAO {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String email = "ram@gmail.com";
		String password = "ram1234";
		
		// Step 1 - get jar and load Driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Step 2 - create connection which requires url, userid, password
		// http://amazon.in:80/mobiles
		// jdbc:mysql://localhost:3306/<dbname>
		// jdbc - java database connectivity
		String url = "jdbc:mysql://localhost:3306/billingdb";
		String userIDdb = "root";
		String passwordDB = null;
		Connection connection = DriverManager.getConnection(url, userIDdb, passwordDB);
		
		// Step 3 - Create statement
		Statement statement = connection.createStatement();
		
		// Step 4 - execute sql query and fetch some data from database
		ResultSet resultSet = statement.executeQuery("select * from user_mst where email='ram@gmail.com' and password='ramm1234'");
		
		// Step 5 - check if some data has been returned or not
		if(resultSet.next()) {
			System.out.println("Welcome " + resultSet.getString("name"));
		}
		else {
			System.out.println("Invalid email or password");
		}
		
		resultSet.close();
		statement.close();
		connection.close();
	}
}
