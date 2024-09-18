package com.Spring_DependencyInjection.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String args[])
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("Configuration.xml");
    	
    	Sports sp=(Sports)context.getBean("sp");
    	
    	Games gs=(Games) context.getBean("gs");
    	
    	System.out.println(sp);
    	System.out.println(gs);
    }
}
