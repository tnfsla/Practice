package com.kh.chap05_initBlock.model.vo;

public class Product {
//	인스턴스 변수
//	1. 아무 초기화 없이 Product객체를 생성하여 출력시 JVM이 정한 기본값으로 초기화되어있음
//	private String pName;
//	private int price;
//	private static String brand;
//	
	
//	2. 필드에 명시적 초기화 한 후 객체 생성하여 출력
	private String pName = "갤럭시";      
	private int price = 900000;
	private static String brand = "삼성";
	
//	3. static 블록 -> 클래스 변수를 초기화 시키는 블럭으로 프로그램 시작시 단 한번만 초기화, 클래스 초기화
	static {
//		pName = "갤럭시1";
//		price = 1000000;
//		불가능 => static 블럭에서는 인스턴스변수를 초기화 하지 못한다.
		
		brand = "엘지";
	}
	
//	4. 인스턴스 블록 -> 인스턴스 변수를 초기화시키는 블럭으로 객체 생성시 마다 초기화된다. 생성자보다 먼저 실행됨.
	{
		pName = "갤럭시 1";
		price = 1000000;
//		brand = "애플"; 인스턴스 블럭에서 static 필드 초기화도 가능은 하지만 static 초기화 블럭은 프로그램 시작시에 초기화 하기 때문에
//						 객체 생성이후 값을 초기화하는 인스턴스 초기화 블럭의 값으로 덮어쓰게 된다.
//		공통으로 쓰는 변수이기때문에 static으로 해서 바꿔주자.
	}
	
	public Product() {	//생성자
		
	}
	
	public void setPName(String pName) {
		this.pName = pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public static void setBrand(String brand) {
		Product.brand = brand;
	}
	
	public String getPName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public static String getBrand() {
		return Product.brand;
	}
	
	public String information() {
		return pName + "  " +price+ "  " +brand;
	}

}
// 순서
// 1. JVM이 정한 기본값으로 객체 생성됨 
// 2. 명시적 초기화 ex) String name = "홍길동";
// 3. 클래스 초기화 블럭
// 4. 인스턴스 초기화 블럭

// 클래스 변수의 초기화 순서
// JVM이 정한 기본값 -> 명시적 초기값 -> 초기화 블록

// 인스턴스 변수의 초기화 순서
// JVM이 정한 기본값 -> 명시적 초기값 -> 초기화 블록 -> 매개변수가 있는 생성자


