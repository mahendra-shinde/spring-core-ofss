package com.mahendra.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductBFactory {

	private Manufacturing manufacture;
	
	private Packaging packaging;
	
	
	@Autowired // Constructor Injection
	public ProductBFactory(Manufacturing manufacture, Packaging packaging) {
		this.manufacture = manufacture;
		this.packaging = packaging;
		System.out.println("LOG : Creating Product A Factory!");

	}


}
