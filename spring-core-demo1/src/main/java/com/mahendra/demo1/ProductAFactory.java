package com.mahendra.demo1;

public class ProductAFactory {

	private Manufacturing manufacture;
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
