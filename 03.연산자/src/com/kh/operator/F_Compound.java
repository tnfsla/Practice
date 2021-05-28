package com.kh.operator;

public class F_Compound {

	/*
	 * * 복합 대입 연산자 : 산술연산자와 대입연산자를 함께 사용하는 연산자
	 * 				  연산처리 속도가 훨씬 빠르므로 사용을 권장한다. 
	 * 
	 * +=, -=, *=, /=, %=
	 * 
	 * a = a + 3;	=>   a += 3;
	 * a = a - 3;	=>	 a -= 3;
	 * a = a * 3;	=>	 a *= 3;
	 * a = a / 3;	=> 	 a /= 3;
	 * a = a % 3;	=> 	 a %= 3;
	 * 
	 */
	
	public void method1() {
		int num = 12;
		System.out.println("num : " +num);
		num += 3;
		System.out.println("num += 3 결과 : "+ num);
		
		num-= 5;
		System.out.println("num -= 5 결과 : "+ num);
		
		num *= 6;
		System.out.println("num *= 6 결과 : "+ num);
		
		num /= 2;
		System.out.println("num /= 2 결과 : "+ num);
		
		num %= 4;
		System.out.println("num %= 4 결과 : "+ num);
		
		String str = "Hello";
		System.out.println("str : "+str);
		str += "World";
		System.out.println("str : "+str);
	}
}
