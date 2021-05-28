package com.kh.chap02_abstractAndInterface.model.vo;

public class BasketBall extends Sports implements ISports1, ISports2{

	//상속받는 순간
	//부모 클래스에 있는 추상 메소드를 강제 오버라이딩하게 뜬다. 또는 추상클래스로 BasketBall을 바꾸게끔 된다.  -->미완성상태이기 때문에 이렇게 됨.
	// 미완성클래스 , 클래스 extends(하나만상속가능)
	// 인터페이스 : implements (여러개 가능)
	@Override
	public void rule() {
		// TODO Auto-generated method stub
		System.out.println("공을 던져서 링에 넣어야 한다.");
		
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
