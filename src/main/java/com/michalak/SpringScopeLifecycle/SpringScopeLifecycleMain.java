package com.michalak.SpringScopeLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.michalak.SpringCore.Triangle;

public class SpringScopeLifecycleMain {

	
	public static void main(String[] args) {
		
///ApplicationContext = ConfigurableApplicationContext		
		ConfigurableApplicationContext   applicationContext = new ClassPathXmlApplicationContext("com/michalak/SpringScopeLifecycle/spring.xml");

		
		// To interface
		Shape shape = (Circle) applicationContext.getBean("circle1");	 	
		shape.draw();
		 
		 
		applicationContext.close();
		
		 // FOR JAVA SE APPLICATION Only applicationContext.registerShutDownHook 
		
	}
	
	
}
