package com.michalak.SpringScopeLifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Circle implements ApplicationContextAware, BeanNameAware ,   
//** ApplicationContextAware Gives information about container features** SpringScopeLifecycleMain							
					InitializingBean, DisposableBean,
					Shape{ 
	

	
	private Radius radius;
	private ApplicationContext context;
	
	
	
	
	
	
	
	public void draw(){
		// Shape interface  draw method
		System.out.println("draw Circle"  );	
		System.out.println( "SIze From Property file; " +radius.getSize());
	}
	
	

	public Radius getRadius() {
		return radius;
	}
	public void setRadius(Radius radius) {
		this.radius = radius;
	}

	
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// ApplicationContextAware		
		this.context = context;
	}
	public ApplicationContext getContext() {
		return context;
	}


	public void setBeanName(String beanName) {
		//BeanNameAware
		System.out.println(" BeanNameAware bean name; " + beanName);
	}



	public void destroy() throws Exception {
		// DisposableBean ANY CLEANUP CODE HEAR 
		System.out.println("ON DESTROY From DisposableBean");
	}



	public void afterPropertiesSet() throws Exception {
		// InitializingBean
		System.out.println("Start when Initializing set From InitializingBean ");
		
	}

	public void initializingMethod() throws Exception {
		// Initializing 
		System.out.println("  Initializing From XML Method");
		
	}
	
	public void destroyMethod() throws Exception {
		//  destroy
		System.out.println("  destroy From XML Method");
		
	}
	
	
	
}
