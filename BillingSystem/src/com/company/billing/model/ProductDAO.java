package com.company.billing.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.company.billing.utils.CommonDAO;

public class ProductDAO {
	public static boolean bulkUpload(ArrayList<Product> productsList) throws ClassNotFoundException, SQLException {
		
		if(productsList == null || productsList.isEmpty()) {
			return false;
		}
		
		Connection connection = CommonDAO.getConnection();
		connection.setAutoCommit(false);
		PreparedStatement preparedStatement = connection.prepareStatement("insert into product_mst (id, name, description, price, imgpath, brand, category) values (?,?,?,?,?,?,?)");
		for(Product product : productsList) {
			preparedStatement.setString(1, product.getId());
			preparedStatement.setString(2, product.getName());
			preparedStatement.setString(3, product.getDescription());
			preparedStatement.setDouble(4, product.getPrice());
			preparedStatement.setString(5, product.getPath());
			preparedStatement.setString(6, product.getBrand());
			preparedStatement.setString(7, product.getCategory());
			preparedStatement.addBatch();
		}
		int[] results = preparedStatement.executeBatch();
		
		boolean doRollback = false;
		for(int result : results) {
			if(result == 0) {
				doRollback = true;
				break;
			}
		}
		
		if(doRollback) {
			connection.rollback();
			return false;
		}
		else {
			connection.commit();
			return true;
		}
	}
	
	public static ArrayList<String> getProductNames() throws ClassNotFoundException, SQLException{
		ArrayList<String> productNames = new ArrayList<>();
		try(Connection connection = CommonDAO.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement("select name from product_mst ");
				ResultSet resultSet = preparedStatement.executeQuery();){
			while(resultSet.next()) {
				productNames.add( resultSet.getString("name") );
			}
		}
		
		return productNames;
	}
	
	public static Product getProductByName(String name) throws ClassNotFoundException, SQLException {
		Product product = new Product();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = CommonDAO.getConnection();
			preparedStatement = connection.prepareStatement("select * from product_mst where name = ?");
			preparedStatement.setString(1, name);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				product.setId( resultSet.getString("id") );
				product.setName( resultSet.getString("name") );
				product.setDescription( resultSet.getString("description") );
				product.setPrice( resultSet.getDouble("price") );
				product.setPath( resultSet.getString("imgpath") );
				product.setBrand( resultSet.getString("brand") );
				product.setCategory( resultSet.getString("category") );
			}
		}
		finally {
			resultSet.close();
			preparedStatement.close();
			connection.close();
		}
		
		return product;
			
	}
}
