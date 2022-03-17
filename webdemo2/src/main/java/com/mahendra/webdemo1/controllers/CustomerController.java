package com.mahendra.webdemo1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("new-customer.htm")
public class CustomerController {
	
	@Autowired private CustomerData data;

	@RequestMapping(method = RequestMethod.GET)
	public String showForm(Model model) {
		model.addAttribute("customer",new Customer());
		return "form";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String createCustomer(@ModelAttribute("customer") Customer customer, BindingResult results, Model model) {
		System.out.println("Processing new customer "+customer.getFirstName()+" "+customer.getLastName());
		model.addAttribute("message", "New Customer added successfuly !");
		data.add(customer);
		return "redirect:/index.htm";
	}
}
