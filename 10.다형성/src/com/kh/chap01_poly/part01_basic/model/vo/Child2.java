package com.kh.chap01_poly.part01_basic.model.vo;

public class Child2 extends Parent {
	private int n;
	
	public Child2() {
		// TODO Auto-generated constructor stub
	}
	
	public Child2(int x, int y, int n) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void printChild2() {
		System.out.println("Child2 클래스이다");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Child2 클래스이다.(print()를 오버라이드한)");
		
		
	}

	
}
