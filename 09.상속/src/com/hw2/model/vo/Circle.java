package com.hw2.model.vo;

public class Circle extends Point {
	private int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		System.out.printf("면적 : %.1f\n둘레 : %.1f\n",Math.PI*radius*radius,Math.PI*radius*2);
		
	}
	
}
