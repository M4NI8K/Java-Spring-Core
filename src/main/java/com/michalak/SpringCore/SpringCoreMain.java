package com.michalak.SpringCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class SpringCoreMain {

	
	public static void main(String[] args) {
		ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("com/michalak/SpringCore/spring.xml");
		
		Triangle triangle = (Triangle) applicationContext.getBean("triangle");	 
		triangle.draw();
		
		
		
	}
	
	
	
}
