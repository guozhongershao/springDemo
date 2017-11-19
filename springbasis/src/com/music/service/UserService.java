package com.music.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.bean.User;

@Service(value = "userservice") 
//@Service  -- 不命名该bean, 怎么实现注入
public class UserService {

	//属性注解方式一
	@Autowired //根据类名去找该类的对象，完成注入，与类的bean名没有关系
	private User user;
	
	//属性注解方式二
	@Resource(name="user") //与@Autowired 不同在于使用bean名来获取对象
	private User user2;
	
	public void showUser2() {
		System.out.println("user1 : " + user);
		System.out.println("user2Name : " + user2.getUserName());
	}
	
	public void showUser(){
		System.out.println("user2 : " + user2);
		System.out.println("userName : " + user.getUserName());
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
