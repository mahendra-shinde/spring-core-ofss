package com.mahendra.demo1;


//Responsible for
// 1. Ordered Creation of all components
// 2. Dependency Injection

public class IOCContainer {
	private ProductAFactory factoryA = null;
	private ProductBFactory factoryB = null;
	private Manufacturing manufacturing = null;
	private Packaging packaging = null;
	
	
	public  ProductAFactory getProductAFactory() {
		return factoryA;
	}

	public  ProductBFactory getProductBFactory() {
		return factoryB;
	}
	
	public IOCContainer() {
		//IOC WIll create all DEPENDENCIES first
		manufacturing=new Manufacturing();
		packaging = new Packaging();
		// Perform Dependency Injection
		factoryA = new ProductAFactory(manufacturing, packaging);
		factoryB = new ProductBFactory(manufacturing, packaging);
	}
	
}
