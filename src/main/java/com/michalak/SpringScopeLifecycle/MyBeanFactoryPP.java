package com.michalak.SpringScopeLifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;

public class MyBeanFactoryPP implements BeanFactoryPostProcessor {

	
// This runs when BeanFacrory/ConfigurableApplicationContext(Same) gets INITIALIZED
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("MyBeanFactoryPP");
	}

	
	
	
	
	
	
}
