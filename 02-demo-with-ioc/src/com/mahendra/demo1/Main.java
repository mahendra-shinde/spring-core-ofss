package com.mahendra.demo1;

public class Main {

	public static void main(String[] args) {
		IOCContainer container= new IOCContainer();
		ProductAFactory factory1 = container.getProductAFactory();
		ProductBFactory factory2 = container.getProductBFactory();
		ProductAFactory factory3 = container.getProductAFactory();
	}

}
