package com.michalak.SpringEventHangling;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.ApplicationEventMulticaster;

public class DrawEvent extends  ApplicationEvent {

	public DrawEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}


	
	
	
}
