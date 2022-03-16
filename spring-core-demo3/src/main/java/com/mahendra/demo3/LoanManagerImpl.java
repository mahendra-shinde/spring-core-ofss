package com.mahendra.demo3;

import org.springframework.stereotype.Component;

@Component
public class LoanManagerImpl implements LoanManager {

	public void apply() {
		System.out.println("Processing your loan application....");
	}

	public void search() {
		System.out.println("The application is NOT found...");
	}

}
