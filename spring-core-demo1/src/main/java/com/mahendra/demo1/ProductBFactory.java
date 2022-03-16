package com.mahendra.demo1;

public class ProductBFactory {

	private Manufacturing manufacture;
	private Packaging packaging;
	
	public ProductBFactory(Manufacturing manufacture, Packaging packaging) {
		this.manufacture = manufacture;
		this.packaging = packaging;
		System.out.println("LOG : Creating Product A Factory!");

	}


}
