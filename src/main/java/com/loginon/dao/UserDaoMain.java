package com.loginon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.loginon.db.Db;

public class UserDaoMain implements UserDao {
	 @Override
	    public boolean addUser(User user) {
	        String query = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";

	        try (Connection cn = Db.getConnection();
	             PreparedStatement pd = cn.prepareStatement(query)) {

	            pd.setString(1, user.getUsername());
	            pd.setString(2, user.getPassword() );
	            pd.setString(3, user.getEmail());

	            int rowsAffected = pd.executeUpdate();

	            return rowsAffected > 0;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }

	    @Override
	    public boolean isValidUser(String username, String password) {
	        String query = "SELECT * FROM users WHERE username = ? AND password = ?";
	    	 try (Connection cn = Db.getConnection();
	             PreparedStatement pd = cn.prepareStatement(query)) {

	            pd.setString(1, username);
	            pd.setString(2, password);

	            ResultSet resultSet = pd.executeQuery();

	            return resultSet.next();
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	}