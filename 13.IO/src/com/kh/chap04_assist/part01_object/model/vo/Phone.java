package com.kh.chap04_assist.part01_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable{ /**  // 직렬화 시켜주는 인터페이스 : Serializable
	 * 
	 */
	private static final long serialVersionUID = 2797846286390670200L; // 새로운 아이디 생성
	// 직렬화 : 객체를 입출력하고자 할때 직렬화 과정이 필수이다.
	
	private String brand;
	private int price;
	
	public Phone() {
		// TODO Auto-generated constructor stub
	}

	public Phone(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Phone [ brand = "+brand+", price = "+price+" ]";
	}
	
	

}
