package com.music.bean;

public class User {
	
	private String userName = "userName";
	
	public User() {
		super();
	}

	public User(String userName) {
		super();
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
