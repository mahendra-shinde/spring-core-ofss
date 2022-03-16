package com.mahendra.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		// Initialize the Spring IOC Container 
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/app-context.xml");
		
		// Retrieving individual bean from Context ...
		 ProductAFactory factory1 = context.getBean(ProductAFactory.class);
		 ProductAFactory factory2 = context.getBean("productAFactory",ProductAFactory.class);

	}

}
