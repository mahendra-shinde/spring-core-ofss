package com.mahendra.webdemo3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/index.html")
	public String home(Model model) {
		model.addAttribute("message","Welcome to Spring BOOT !");
		return "home";
	}
}
