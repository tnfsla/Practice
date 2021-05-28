package com.kh.chap04_wrapper.controller;

public class B_WrapperStringTest {
	//기본 자료형 <-->String
	public void method1() {
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1+str2); //자료형이 String이라 더해지지않고 이어붙여서나옴 (1015.3)
		
		//1. String --> 기본자료형으로 바꾸기위해서
		//해당 Wrapper클래스.parseXXX() 사용한다.
		
		int i1 = Integer.parseInt(str1);
		double d1 = Double.parseDouble(str2);
		
		System.out.println(i1+d1); // 이렇게 변수형으로 바꿔서 더해주면 됨
		
		//2. 기본자료형 --> String 으로 바꾸기위해
		// 기본자료형 --> wrapper --> String
		//해당 Wrapper클래스.valueOf().toString() 사용
		String strI1 = Integer.valueOf(i1).toString();
		String strD1 = Double.valueOf(d1).toString(); //toString() 없으면 오류남
		
		System.out.println(strI1);
		System.out.println(strD1);
		
		String strI = String.valueOf(i1); // 이렇게 하면 짧게 가능
		String strD = String.valueOf(d1);
		
		System.out.println(strI);
		System.out.println(strD);
		
	}

}
