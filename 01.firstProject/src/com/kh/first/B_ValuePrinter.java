package com.kh.first;

public class B_ValuePrinter {

	public void printValue() {
		//1. 숫자 출력
		System.out.println(123); 	//정수값
		System.out.println(1.23);	//실수값
		
		
		//2. 문자(한글자) 출력 작은 따옴표 사용
		System.out.println('하');
		System.out.println('c');	
		
		//3. 문자열 출력 큰 따옴표
		System.out.println("문대훈");
		System.out.println("ㅎㅇㅎㅇ");
		
		//4. 연산한 결과값 출력
		System.out.println(123+45+7);
		
		//5. 문자와 숫자의 연산 / 문자를 숫자로 인식
		System.out.println('부'+1);
		
		//6. 문자열과 그외 값을 덧셈연산   / 문자열 화 함
		System.out.println("하이"+'a'+"cc");
		System.out.println("헤으응"+123);
		System.out.println("바윙"+111+222);
		
		
	}
}
