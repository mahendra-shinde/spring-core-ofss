package com.mahendra.demo1;

public class Main {

	public static void main(String[] args) {
		ProductAFactory factory1 = new ProductAFactory();
		ProductBFactory factory2 = new ProductBFactory();
		// ......
		ProductAFactory factory3 = new ProductAFactory();
	}

}
