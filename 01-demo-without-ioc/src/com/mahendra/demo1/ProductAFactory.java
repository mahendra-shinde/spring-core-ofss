package com.mahendra.demo1;

public class ProductAFactory {

	private Manufacturing manufacture;
	private Packaging packaging;
	
	public ProductAFactory() {
		//Traditional approach
		manufacture = new Manufacturing();
		packaging = new Packaging();
		System.out.println("LOG : Creating Product B Factory!");
	}
}
