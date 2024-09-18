package com.Spring_DepedencyInjection.AnotationBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		ApplicationContext context= new ClassPathXmlApplicationContext("Configuration.xml");
		
		Employee employee= context.getBean("employee",Employee.class);
		
		System.out.println(employee);
		
		Employeer employeer=context.getBean("employeer",Employeer.class);
		
		System.out.println(employeer);
	}

}
