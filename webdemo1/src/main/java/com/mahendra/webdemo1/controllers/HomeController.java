package com.mahendra.webdemo1.controllers;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	

	@RequestMapping("/index.htm")
	public String home(Model model) {
		model.addAttribute("message","List of Customers");
		List<Customer> customers = new LinkedList<>();
		customers.add(new Customer(101,"Vladmir","Putin","465635365"));
		customers.add(new Customer(102,"Joe","Biden","676635365"));
		model.addAttribute("customers",customers);
		return "home"; //View Resolver will convert this string into file-path ==> /WEB-INF/jsp/home.jsp
	}
	
}
