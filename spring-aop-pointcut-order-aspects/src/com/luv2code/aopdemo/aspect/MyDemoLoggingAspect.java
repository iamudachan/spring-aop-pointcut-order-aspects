package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

	// this is where we add all of our related advices for logging
	
	// let's start with an @Before advice
	
//	@Before("execution(public void addAccount())")    we can use this also 

//	@Before("execution(public void 	com.luv2code.aopdemo.dao.AccountDAO.addAccount())")   we can use this also
	
//	@Before("execution(public void add*())")  
//	we can use * also it will call all the methods like pattern call any class and any method start with add
	
//	public modifier is optional we can give * also else we can remove it 
//	@Before("execution(* void add*())")  or @Before("execution(void add*())")
	
	
//	working
//	@Before("execution(* add*( com.luv2code.aopdemo.Account))")   one parm
//	@Before("execution(* add*( com.luv2code.aopdemo.Account,..))")   ..multiple param
//	@Before("execution(* add*(..))")  any num of params

	
//	@Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")  package search .*.*(..) = .class_name.method_name.(..)
	

	@Before("com.luv2code.aopdemo.aspect.LvuAopExpressions.excludeSetGetMehosd()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n=====>>> Executing @Before advice on beforeAddAccountAdvice");
	}
	

	
	
	
}










