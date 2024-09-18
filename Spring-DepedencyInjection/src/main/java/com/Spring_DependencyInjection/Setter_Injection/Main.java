package com.Spring_DependencyInjection.Setter_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		ApplicationContext context=new ClassPathXmlApplicationContext("Configuration.xml");
		
		Student student=(Student) context.getBean("student");
		
		Student student1=(Student) context.getBean("student1");
		
		System.out.println(student);
		
		System.out.println(student1);
		
		//Employee emp=(Employee) context.getBean("emp");
		
		//System.out.println(emp);
	}

}
