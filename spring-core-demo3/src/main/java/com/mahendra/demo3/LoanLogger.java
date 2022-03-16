package com.mahendra.demo3;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoanLogger {
	
	@Pointcut("execution (* com.mahendra.demo3.LoanManagerImpl.*(..))")
	public void pointCut() { }
	
	// (..) ==> Any number of arguments to method
	// * =-> All the methods
	@Before("pointCut()")
	public void recordThat(JoinPoint jp) {
		System.err.println("Processing the request..."+ jp.getSignature());
	}
}
