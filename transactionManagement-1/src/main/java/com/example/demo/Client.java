package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Employee employee=context.getBean("employee",Employee.class);
		System.out.println(employee);
		
	}
}
