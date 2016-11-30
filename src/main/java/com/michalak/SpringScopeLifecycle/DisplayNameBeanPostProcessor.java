package com.michalak.SpringScopeLifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor{

	
//DisplayNameBeanPostProcessor runs EACH Time when been is  Initialized	
	//For method that runs witch each been
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("PostProcessor ;After initialization Method; " +beanName);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		
		
		System.out.println(" PostProcessor ;Before initialization Method; " +beanName);
		return bean;
	}

	
	
}
