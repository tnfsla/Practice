package com.kh.chap04_field.model.vo;

public class FieldTest3 {
	//전역변수의 일종인 클래스 변수는 static 예약어가 붙은 변수
	
	//static -> 프로그램을 실행하자마자 static 메모리 영역에 할당됨,
	//static 은 공유의 개념
	
	//일반 변수는 이 클래스로 객체를 생성해야만 그 변수가 메모리에 올라간다면,
	//static이 붙은 변수는 프로그램 실행과 동시에 메모리에 올라간다.
	
	public static String pubsta = "public static";
	private static String prista = "private static";
	
	public FieldTest3() {
		
	}
	
	// public static은 public이므로 언제 어디서든 접근가능하기때문에
	// setter, getter 필요없음. 
	// private 변수에 대해서만 만들고, static 예약어가 붙으면 메소드 또한
	// ***static***을 붙여서 만들어야한다.
	
	public static void setPrista(String prista) {
//		this.prista = prista; // static선언은 이렇게 사용하지 않는다.
		//static은 객체생성하지않고 프로그램 실행과 동시에 static 영역에 할당되믈로
		//this가 존재하지 않는다.
		
		FieldTest3.prista = prista;  //class명.변수명 으로 사용
	}
	
	public static String getPrista() {
		return prista;
	}

}
