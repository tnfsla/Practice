package com.hw2.model.vo;

public class Rectangle extends Point {
	private int width;
	private int height;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.height = height;
		this.width = width;
		// TODO Auto-generated constructor stub
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		
		System.out.printf("면적 : %d\n둘레 : %d\n",height*width,2*(height+width));
	}	
	
	

}
