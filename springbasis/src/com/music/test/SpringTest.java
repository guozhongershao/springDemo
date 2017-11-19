package com.music.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.music.bean.User;
import com.music.service.UserService;

public class SpringTest {
	@Test
	public void testUser(){
		/**
		 * spring 中的bean 实例化过程
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 无参构造（绝大多数时候）
//		User user1 = (User)context.getBean("user");
//		User user2 = (User)context.getBean("user");
		//静态工厂方法创建对象
//		User user = (User) context.getBean("staticuser");
		// 实例工厂方法创建对象
//		User user = (User) context.getBean("instanceuser");
//		
//		System.out.println(user1);
//		System.out.println("user2 :" + user2);
		
		// 有参构造属性注入
//		PropertiesTest propertiesTest = (PropertiesTest)context.getBean("propertietest");
//		propertiesTest.displayTestPropertie();
		
		// 使用set方法实现对象的属性注入
//		User user = (User)context.getBean("userproperty");
//		System.out.println("password ： " + user.getPassword());
		
//		// 类对象注入
//		UserService userService = (UserService) context.getBean("userservice");
//		userService.showUser();
//		System.out.println("password : " + userService.getUser().getPassword());
		
		//基于注解获取对象
//		User user = (User) context.getBean("user");
//		System.out.println(user.getPassword());
		
		UserService userService = (UserService) context.getBean("userservice");
		userService.showUser();
		userService.showUser2();
	}
}
