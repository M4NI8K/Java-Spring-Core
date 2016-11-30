package com.michalak.SpringCore;

import java.util.ArrayList;
import java.util.List;

import com.michalak.SpringScopeLifecycle.Shape;

public class Triangle implements Shape {

	

	
	private Point pointA;
	private Point pointB;
	
	private List<Point> pointList  ;
	

	
	
	
	public List getPointList() {
		return pointList;
	}
	public void setPointList(List pointList) {
		this.pointList = pointList;
	}
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

	
	public void draw(){
		System.out.println("DRAW");
		System.out.println("x" + pointA.getX() );
		System.out.println("y" + pointA.getY() );
		System.out.println("List");
		System.out.println("x" + pointList.get(0).getX() );
		System.out.println("y" + pointList.get(0).getY() );
		
	}
	
	
	
}
