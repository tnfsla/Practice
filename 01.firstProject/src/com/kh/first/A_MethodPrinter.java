package com.kh.first;	//패키지명은 항상 소문자로 시작한다.

public class A_MethodPrinter {  //클래스명은 항상 대문자로 시작한다.

	public void methodA() { //매소드명도 항상 소문자로 시작
		
		System.out.println("메소드 A 출력문");
		methodB();
	}
	
	public void methodB() {
		System.out.println("메소드 B 출력문");
		int a = methodC(100);
		System.out.println(a);
	}
	
	public int methodC(int intValue) { 	//변수명은 항상 소문자로
		System.out.println("메소드 C 출력문" + intValue);
		return intValue+100;
	}
}
