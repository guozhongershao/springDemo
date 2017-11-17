package com.music.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.music.bean.User;

public class SpringTest {
	@Test
	public void testUser(){
		/**
		 * spring 中的bean 实例化过程
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 无参构造（绝大多数时候）
//		User user = (User)context.getBean("user");
		//静态工厂方法创建对象
//		User user = (User) context.getBean("staticuser");
		// 实例工厂方法创建对象
		User user = (User) context.getBean("instanceuser");
		
		System.out.println(user.getUserName());
	}
}
