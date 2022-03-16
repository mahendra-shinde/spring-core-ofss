package com.mahendra.demo4;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/app-context.xml");
	DepartmentDAO dao = context.getBean(DepartmentDAO.class);
	System.out.println("Got the bean, lets fire query !");
	List<Department> departments = dao.findAll();

	System.out.println("Print all ! ");
	System.out.println("+------+------+------+---------------------+");
	System.out.println("|DEPTID|LOC_ID|MAN_ID|NAME                 |");
	System.out.println("+------+------+------+---------------------+");
	
	departments.forEach(Main::print);
	
	/*
	 * for(Department d : departments) { 
	 * 		Main.print(d); 
	 * }
	 */
	System.out.println("+------+------+------+---------------------+");	
	}

	public static void print(Department d) {
		System.out.printf("| %4d | %4d | %4d | %-20s| \n",
				d.getDeptId(), 
				d.getLocationId(), 
				d.getManagerId(), 
				d.getName());
	}
}
