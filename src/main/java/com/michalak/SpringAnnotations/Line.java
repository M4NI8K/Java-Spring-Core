package com.michalak.SpringAnnotations;
import org.springframework.stereotype.Component;

import com.michalak.SpringCore.Point;
import com.michalak.SpringScopeLifecycle.Shape;




@Component  //Marks as bean ony 1 bean per 
public class Line implements Shape {

	private Point pointA;
	private Point pointB;
	private String lineSize;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public String getLineSize() {
		return lineSize;
	}
	public void setLineSize(String lineSize) {
		this.lineSize = lineSize;
	}

	
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("LINE ");

	}

}
