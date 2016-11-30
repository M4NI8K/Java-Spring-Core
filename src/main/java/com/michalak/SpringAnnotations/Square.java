package com.michalak.SpringAnnotations;

import java.util.List;

import javax.annotation.*; 


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import com.michalak.SpringCore.Point;
import com.michalak.SpringScopeLifecycle.Shape;

@Component
public class Square implements Shape {

	
	private List<Point> pointsList;
	private Point point;
	
	private MessageSource messageSource;


public MessageSource getMessageSource() {
	return messageSource;
}

@Autowired 
public void setMessageSource(MessageSource messageSource) {
	this.messageSource = messageSource;
}
	
	
	
	

	public Point getPoint() {
		return point;
	}
	
	@Resource(name="pointJSR250")  // JSR250 
//	@Autowired
//	@Qualifier("squarePoint")
	public void setPoint(Point point) {
		this.point = point;
	}


	public List<Point> getPointsList() {
		return pointsList;
	}

 
	@Required// <bean class="org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor"></bean> <!-- @Required -->
	//  makes shore pointsList is not null !!
	public void setPointsList(List<Point> pointsList) {
		this.pointsList = pointsList;
	}
	

	 



	public void draw() {
		 
		System.out.println("Square");
		System.out.println(" Autowire with @Qualifier(squarePoint); " + point.getX() +"X " + point.getY() + "Y" );
		
		System.out.println(this.messageSource.getMessage("from.my.message", null, "Can't find value from.my.message ", null));
		
		System.out.println(this.messageSource.getMessage("parameter.message", new Object[] {point.getX(),point.getY()} , //array of object 
				"Can't find value parameter.message ", null));
	}
	@PostConstruct
	public void initializeSquare(){
		System.out.println("JSR250 initialize Method ");
	}
	@PreDestroy
	public void destroySquare(){
		System.out.println("JSR250 destroy Method ");
	}


	
	
}
