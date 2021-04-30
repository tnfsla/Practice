package com.kh.varable; // A_Variable 과 이름이 겹치지만 서로 다른 패키지여서 문제되지않음.

public class A_Variable {
		// 변수란 : 어떠한 값을 메모리에 기억하기 위한 공간이다 (박스같은개념)
		/* 변수를 사용하는 이유 :
		 * 변수는 우선적으로 값에 의미를 부여하기위한 목적으로 사용 한다. (가독성이 좋아짐)
		 * 또한 한번값을 저장해두고 계속 사용할 목적으로 사용된다. 
		 * 
		 * -> 유지보수를 쉽게 하기위한 목적
		*/
	
	public void printValue() {
		System.out.println("변수 사용전");
		System.out.println(2*3.1415926 * 10);
		
		double pi = 3.1415926;
		int r = 10;
		int h = 20;
		
		System.out.println("변수 사용 후");
		System.out.println(2* pi* r);
		System.out.println(pi*r*r);
		System.out.println(4*pi*r*h);
		
		
	}
	
	public void declareVariable() {
		/*
		 * 변수의 선언 (저장할 값을 기록하기 위한 변수를 메모리 공간에 확보해놓는 과정) == 변수(박스)만들겠다!! 
		 * [표현법] 자료형 변수명;
		 * 
		 * 자료형 : 어떤 값을 담아낼지, 어떤 크기의 값을 담아낼지에 대해 변수(박스)의 크기 및 모양을 정하는 부분
		 * 변수명 : 변수(박스)의 이름을 정하는 부분 (의미부여) -> 여기서 지정한 이름으로 앞으로 호출
		 * 
		 * 주의할점
		 * - 변수명은 반드시 첫 문자가 소문자여야된다. 
		 * - 하지만 여러단어로 엮어 있는경우 연결되는 단어의 첫글자는 대문자 
		 * - 동일한 변수명으로 선언 불가
		 * - 해당 영역({})에 선언한 변수는 해당 지역 안에서만 꺼내 쓸수 있다. (다른 메소드에서는 사용 불가)
		 *   == 지역변수 개념
		 * 
		 */
		
		// 자료형에 대한 개념
		// 1. 논리형
		boolean isTrue; //true, false, 0, 1 //1byte
		
		// 2. 숫자
		// 2-1. 정수형
		byte bNum;	//1byte
		short sNum;	//2byte
		int iNum;	//4byte 범용적
		long lNum;	//8byte L붙여야함
		
		
		// 2-2. 실수형
		float fNum; //4byte f붙여야함
		double dNum;//8byte 범용적 
		
		// 3. 문자형
		char ch;	//2byte
		
		//-----------기본 자료형----------------------
	
		// 4. 문자열
		String str; //참조형
		
		
		//변수에 값 대입 , 선언하였다면 값대입을 해야함
		//[표현법] 변수명 = 값;
		isTrue = true;
		bNum = 1;
		sNum = 2;
		iNum = 5;
		lNum = 8L;
		fNum = 4.0f;
		dNum = 8.0;
		ch = 'A';
		str = "abcd^^";
		
		
		//변수 값 호출 후 출력
		System.out.println(isTrue);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch);
		System.out.println(str);
		
	}
	
	public void initVariable() {
		
		//선언과 동시에 초기화 
		// 자료형 변수명 = 값;
		
		boolean isTrue = true;
		byte bNum = 1;
		short sNum = 2;
		int iNum = 5;
		long lNum = 8L;
		float fNum = 4.0f;
		double dNum = 8.0;
		char ch = 'A';
		String str = "abcd^^";
		
		
		System.out.println(isTrue);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch);
		System.out.println(str);
		
	
	}
	public void test() {
		boolean v1 = false;
		char v2 = '가';
		double v3 = 3.14;
		int v4 = 30;
		String v5 = "aaa";
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
	}
	// 상수 선언 final int AGE = 15; 절대 변하지 않는 값이며, 변수명은 all 대문자
	
}
