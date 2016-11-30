package com.michalak.SpringEventHangling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.michalak.SpringCore.Triangle;
import com.michalak.SpringScopeLifecycle.Shape;

public class SpringEventHanglingMain {

		public static void main(String[] args) {
			
			
			
			ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("com/michalak/SpringEventHangling/spring.xml");
			
			Painter painter = (Painter) applicationContext.getBean(Painter.class);	 
			 
			
			// 3 core components  
			//event publisher - publishes event (interface)
			//event listener = listens   to   (interface)
			//event class containing informations about event that publisher publishes and listener listen to  (aplicationEvent class) 
			
		
		}
}
