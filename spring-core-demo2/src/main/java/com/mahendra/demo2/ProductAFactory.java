package com.mahendra.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ProductAFactory {

	@Autowired
	// The "Type" here must be a "@Component" itself
	private Manufacturing manufacture;
	
	@Autowired
	private Packaging packaging;
	
	// Dependency Injection
	public ProductAFactory() {
		System.out.println("LOG : Creating Product A Factory!");
	}

	public void setManufacture(Manufacturing manufacture) {
		this.manufacture = manufacture;
	}

	public void setPackaging(Packaging packaging) {
		this.packaging = packaging;
	}
	
}
