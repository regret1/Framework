package com.test.entity;

import org.springframework.stereotype.Component;

@Component("triangle")
public class Triangle extends Shape{

	@Override
	public void viewSize() {
		System.out.println(getTitle() + "의 넓이" + (getWidth()*getHeight()/2));
	}
	
}
