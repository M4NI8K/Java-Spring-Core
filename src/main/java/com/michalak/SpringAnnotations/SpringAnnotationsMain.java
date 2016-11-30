package com.michalak.SpringAnnotations;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.michalak.SpringCore.Triangle;
import com.michalak.SpringScopeLifecycle.Circle;
import com.michalak.SpringScopeLifecycle.Shape;

public class SpringAnnotationsMain {

	
		public static void main(String[] args) {
			
			
			
			ConfigurableApplicationContext   applicationContext = new ClassPathXmlApplicationContext("com/michalak/SpringAnnotations/spring.xml");

			
			Shape shape = (Line) applicationContext.getBean("line");	 	
			shape.draw();
			
			
			Shape shape2 = (Square) applicationContext.getBean("square");	 	
			shape2.draw();
//			
 	 
			System.out.println(
			applicationContext.getMessage("greeting", null, "Can't find value greeting ", null));
			//getMessage(Value | parameter value | alternative value | Local  )
		
			applicationContext.close();
			 
		}
	
}
