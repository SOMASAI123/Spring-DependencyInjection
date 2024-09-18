package com.Spring_DependencyInjection.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Configuration.xml");
		
		Employee emp=(Employee)context.getBean("emp");
        
		System.out.println(emp);
	}

}
