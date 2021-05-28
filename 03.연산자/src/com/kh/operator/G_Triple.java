package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	/*
	 * * 삼항 연산자 : 항목이 3개인 연산자
	 * [표현법] 조건식 ? 조건식이 참일경우의 값1 : 조건식이 거짓일경우의 값2
	 * 
	 * 이때, 조건식은 반드시 true 또는 false가 나오게끔 작성해야된다. 
	 * 주로 조건식에는 비교, 논리 연산자가 사용된다.
	 */
	public void method1() {
		//입력받은 정수가 양수인지 아닌지 판별후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("num은 "+(num>0? "양수이다." : "음수이다."));
	}
	
	public void method2() {
		// 사용자가 입력한 정수값이 홀수인지 짝수인지 판별하고 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값 입력 : ");
		int num = sc.nextInt();
		
		String result = num%2==0 ? "짝수입니다." : "홀수입니다.";
		
		System.out.println(num + "은 "+result);
				
	}
	
	public void method3() {
		// 사용자가 입력한 2개의 정수값의 곱셈의 결과가 100보다 큰경우 "결과가 100 이상입니다."
		//아닌경우 결과가 100보다 작습니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값1 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("정수값2 입력 : ");
		int num2 = sc.nextInt();
		
		String result = num1*num2<=100 ? "100보다 작습니다." : "100보다 큽니다.";
		System.out.println(num1+"와 "+num2+"의 곱은 "+result);
	}
	
	public void method4() {
		// 사용자가 입력한 영문자가 대문자인지 소문자인지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영문자 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch>='A' && ch <= 'Z')? "대문자입니다.":"소문자입니다.";
		System.out.println(result);
		
	}
	
	public void method5() {
		//삼항 연산자 중첩 활용
		// 입력받은 정수가 0인지 아닌지 판별후 0이 아닌경우 양수인지 음수인지 판별
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값 입력 : ");
		int num = sc.nextInt();
		
		String result = (num == 0 ) ? "0입니다." : (num > 0 ) ? "양수입니다. " :"음수입니다. ";
		
		System.out.println(result);
		
	}
	
	public void method6() {
		//두수를 입력받고 +또는 -를 입력 받아서 알맞는 계산 결과를 출력
		//+-이외 다른 문자 입력시 잘못 입력하였습니다 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값1 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("정수값2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("연산자 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch == '+') ? String.valueOf(num1 + num2) : (ch == '-') ? (num1 - num2+"") : "잘못입력하였습니다.";
		//자료형을 String으로 바꾸는 방법은 2가지 방법이 있다. 
		//1. String.valueOf
		//2. 문자열에 공백을 더해줘서 String 화 시키기.
		System.out.println("결과는 :" +result);
		
		
		
	}

}
