package com.kh.operator;

public class B_InDecrease {
	/*
	 * * 증감연산자(단독사용시는 그냥 1증가)
	 * ++ : 값을 1 증가시키는 연산자
	 *      ++값 (전위 연산자), 값++ (후위 연산자)
	 * -- : 값을 1 감소시키는 연산자
	 * 		--값 (전위 연산자), 값-- (후위 연산자)
	 * 
	 * (증감연산자)값 : 전위 연산자 --> 선증감 후처리
	 * 값(증감연산자) : 후위 연산자 --> 선처리 후증감
	 */
	
	public void method1() {
		//전위 연산자 테스트
		
		int num1 = 10;
		System.out.println("전위연산자 적용 전 num1 : "+num1);
		System.out.println("1회수행후 결과 : "+ ++num1);
		System.out.println("2회수행후 결과 : "+ ++num1);
		System.out.println("3회수행후 결과 : "+ ++num1);
		
		//후위 연산자 테스트
		int num2 = 10;
		System.out.println("전위연산자 적용 전 num1 : "+num2);
		System.out.println("1회수행후 결과 : "+ num2++);
		System.out.println("2회수행후 결과 : "+ num2++);
		System.out.println("3회수행후 결과 : "+ num2++);
		
		
	}
	
	public void method2() {
		//전위
		int a =10;
		int b = ++a;
		System.out.println("a : "+a+", b: "+b);
		
		//후위
		int c=10;
		int d =c++;
		System.out.println("c : "+c+", d: "+d);
		
		int num = 20;
		System.out.println("현재 num "+num);
		System.out.println("++num = "+ ++num);
		System.out.println("num ++ = "+ num++);
	}
	
	public void method3() {
		int num1 =20;
		int result = num1++ *3; //result = 60, num1 = 21
		System.out.println("result"+result);
		System.out.println("num1"+num1);
	}

}
