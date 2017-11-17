package com.music.servlet;

import java.io.IOException;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import com.music.bean.User;
import com.music.factory.MyBeanFactory;

@WebServlet("/SpringDemo")
public class SpringDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		URL springXMLUrl = this.getClass().getClassLoader().getResource("spring.xml");
		MyBeanFactory factory = new MyBeanFactory();
		try {
			//解析配置文件
			factory.parse(springXMLUrl);
			Document doc = factory.getDoc();
			Element root = doc.getRootElement();
			//配置的bean
			System.out.println("id " + root.attributeValue("id"));
			System.out.println("class " + root.attributeValue("class"));
			//类名：com.music.bean.User
			String className = root.attributeValue("class");
			try {
				// 反射生成对象
				Class<?> targetClass = Class.forName(className);
				User user = (User)targetClass.newInstance();
				System.out.println("userName :" + user.getUserName());
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
