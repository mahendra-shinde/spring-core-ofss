package com.mahendra.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/app-context.xml");
		
		ProductAFactory factory1 = context.getBean(ProductAFactory.class);
		ProductAFactory factory2 = context.getBean(ProductAFactory.class);
		
		ProductBFactory factory3 = context.getBean(ProductBFactory.class);
		


	}

}
