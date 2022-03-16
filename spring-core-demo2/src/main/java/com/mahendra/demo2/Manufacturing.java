package com.mahendra.demo2;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


// A Typical "Lazy" spring bean
@Component
@Lazy
public class Manufacturing {
	public Manufacturing() {
		System.out.println("LOG : Creating Manufacturing object");
	}
}
