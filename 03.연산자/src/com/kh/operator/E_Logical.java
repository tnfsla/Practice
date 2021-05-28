package com.kh.operator;

import java.util.Scanner;

public class E_Logical {

	/*
	 * * 논리 연산자 - 두 논리값을 연산하는 연산자 - 논리 연산자의 결과값 또한 논리값
	 * 
	 * 논리값 && 논리값 : 왼쪽, 오른쪽 둘 다 true일 경우 true (AND) 이고 , 이면서 논리값 || 논리값 : 왼쪽, 오른쪽 둘
	 * 중에 하나라도 true일 경우 true (OR) 이거나, 또는
	 */

	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력");
		int num = sc.nextInt();
		
		boolean result;
		result = (num<=100)&&(num >= 1) ? true : false;
		System.out.println("사용자가 입력한 num이 1~100인가요?" + result);
		

	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 하나 입력하시오");
		char ch = sc.nextLine().charAt(0);
		
		boolean result;
		result = (ch>='A') && (ch<='Z') ? true : false;
		
		System.out.println("사용자가 입력한 문자가 대문자입니까? "+result);
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("계속하려면 y혹은 Y를 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println("사용자가 입력한 값이 y또는 Y입니까? ");
		boolean result;
		result = (ch=='y')||(ch=='Y');
		
		System.out.println(result);
	}
	
	/*
	 *  && : 두 개의 조건이 모두 true 여야 결과값이 true이다. (AND)
	 *  
	 *  true && true 	=> true
	 *  true && false 	=> false
	 *  false && true	=> false
	 *  false && false 	=> false
	 *  
	 *  --> && 연산자를 기준으로 앞의 결과가 false값이 나온다면 뒤의 조건은 굳이 실행하지 않는다. 
	 *  
	 *  || : 두 개의 조건이 하나라도 true라면 결과값이 true이다. (OR)
	 *  
	 *  true || true 	=> true
	 *  true || false 	=> true
	 *  false || true	=> true
	 *  false || false	=> false
	 * 
	 * --> || 연산자를 기준으으로 앞의 결과가 true가 나온다면 뒤의 조건은 굳이 실행하지 않는다. 
	 */
	
	public void method4() {
		
		int num = 10;
		System.out.println("&& 연산 전의 num 값 : 	" + num);
		
		boolean result1 = (num < 5)&&(++num>0);
		
		System.out.println("result1 = "+result1);
		System.out.println("&& 연산 후의 num 값 : 	" + num); // num<5에서 이미 cut 하기때문에 ++num은 수행하지 않는다.
		
		boolean result2 = (num<20)||(++num>0);
		System.out.println("result2 = "+result2); // num<20을 이미 만족한다 -> or 연산자이므로 1개만 true 이면 뒤에거 수행 안함
		System.out.println("&& 연산 후의 num 값 : 	" + num);
		
	}

}
