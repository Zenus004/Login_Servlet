package com.loginon.dao;

public interface UserDao {
	boolean isValidUser(String username, String password);

	public boolean addUser(User user);

}
