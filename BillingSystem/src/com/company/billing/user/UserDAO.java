package com.company.billing.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.company.billing.utils.CommonDAO;

public class UserDAO {
	public boolean register(String name, String email, String password) throws ClassNotFoundException, SQLException {
		try(Connection connection = CommonDAO.getConnection();
				Statement statement = connection.createStatement();){
			int rowCount = statement.executeUpdate(
					"insert into user_mst (name, email, password) values ('" + name + "', '" + email + "', '" + password + "')");
			if(rowCount == 1) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	public boolean isUserExists(String email) throws ClassNotFoundException, SQLException {
		try(Connection connection = CommonDAO.getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(
						"select * from user_mst where email='" + email + "'");){
			if(resultSet.next()) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	public String loginCheck(String email, String password) throws ClassNotFoundException, SQLException{
		Connection connection = CommonDAO.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("select * from user_mst where email=? and password=?");
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, password);
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next()) {
			return resultSet.getString("name");
		}
		else {
			return null;
		}
		
	}
}
