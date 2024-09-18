package com.Spring_DependencyInjection.SpringLifeCycleMethods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Configuration.xml");
		
	    Teacher teacher=(Teacher)context.getBean("teacher");
	    
	    System.out.println(teacher);
	    
	    context.registerShutdownHook();
	    

	}

}
