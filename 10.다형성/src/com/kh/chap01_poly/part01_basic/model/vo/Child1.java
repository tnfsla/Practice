package com.kh.chap01_poly.part01_basic.model.vo;

public class Child1 extends Parent{
	private int z;
	
	public Child1() {
		// TODO Auto-generated constructor stub
	}

	public Child1(int x, int y, int z) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	

	public void setZ(int z) {
		this.z = z;
	}

	public void printChild1() {
		System.out.println("Child1 클래스 이다");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Child1 클래스 이다(print를 오버라이드한)");
	}
	
	
	

}
