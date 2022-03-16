package com.mahendra.demo1;

public class ProductAFactory {

	private Manufacturing manufacture;
	private Packaging packaging;
	
	// Dependency Injection
	public ProductAFactory(Manufacturing manufacture, Packaging packaging) {
		this.manufacture = manufacture;
		this.packaging = packaging;
		System.out.println("LOG : Creating Product B Factory!");
	}
}
