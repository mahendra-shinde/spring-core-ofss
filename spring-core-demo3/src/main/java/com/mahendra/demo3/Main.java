package com.mahendra.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/app-context.xml");
		
		LoanManager manager = context.getBean(LoanManager.class);
		System.out.println("The actual object "+ manager.getClass().getCanonicalName());
		
		manager.apply();
		
		manager.search();

	}

}
