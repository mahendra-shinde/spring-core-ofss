package com.mahendra.webdemo1.controllers;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@Autowired private CustomerData data;
	
	@RequestMapping("/index.htm")
	public String home(Model model) {
		if(!model.containsAttribute("message"))
			model.addAttribute("message","List of Customers");
	
		model.addAttribute("customers",data.getCustomers());
		return "home"; //View Resolver will convert this string into file-path ==> /WEB-INF/jsp/home.jsp
	}
	
}
