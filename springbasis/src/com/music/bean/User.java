package com.music.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="user") //!< 类似于配置文件 ： <bean id="user" class="" ></bean>
//@Scope(value="prototype") // 配置对象的域？
public class User {
	
	private String userName = "userName";
	
	private String password = "password";
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

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
