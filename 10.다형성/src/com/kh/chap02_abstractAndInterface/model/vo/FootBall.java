package com.kh.chap02_abstractAndInterface.model.vo;

public class FootBall extends Sports implements ISports1{

	@Override
	public void rule() {
		// TODO Auto-generated method stub
		System.out.println("손이 아닌 발로 공을 차야한다.");
		
	}

	@Override
	public void startTime() {
		// TODO Auto-generated method stub
		System.out.println("인터페이스 ISports2메소드 --> startTime()");
		
	}

	@Override
	public void endTime() {
		// TODO Auto-generated method stub
		System.out.println("인터페이스 ISports2메소드 --> endTime()");
	}

	@Override
	public void rule1() {
		// TODO Auto-generated method stub
		System.out.println("인터페이스 ISports1메소드 --> rule()");
	}
	
	
	
	
	
}
