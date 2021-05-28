package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
	/*
	 * * while문
	 * 
	 * [초기식]
	 * 
	 * while(조건식) { 반복적으로 실행할 코드; [증감식] }
	 * 
	 * 조건식이 true일 경우 해당 실행코드 실행
	 * 
	 * 조건식 검사 --> true일 경우 실행코드 실행 조건식 검사 --> true일 경우 실행코드 실행 조건식 검사 --> false일 경우
	 * 실행코드 실행 X --> 반복문 빠져 나감
	 * 
	 * 
	 */

	public void method1() {
		int i = 1;
		while (i <= 5) {
			System.out.println("안녕하세요");
			i++;
		}
		System.out.println();
		i = 1;
		while (i <= 5) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		i = 5;
		while (i >= 1) {
			System.out.print(i + " ");
			i--;
		}
	}

	public void method2() {
		int i = 1;
		while (i <= 10) {

			if (i % 2 != 0) {
				System.out.println(i);

			}
			i++;
		}

		System.out.println();

		i = 1;
		while (i <= 10) {
			System.out.println(i + " ");
			i += 2;
		}
	}

	public void method3() {
		int random = (int) (Math.random() * 10 + 1);
		System.out.println("랜덤 값 : " + random);

		int sum = 0;
		int i = 1;
		while (i <= random) {
			sum += i;
			i++;
		}
		System.out.println("1-random까지 합 : " + sum);
	}

	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇단 ? : ");
		int num = sc.nextInt();
		int i = 1;
		System.out.println("=========" + num + "단========");
		while (i <= 9) {
			System.out.println(num + " * " + i + " = " + num * i);
			i++;
		}
	}

	public void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력");
		String str = sc.nextLine();
		int i = 0;
		while (i < str.length()) {
			System.out.println(str.charAt(i));
			i++;
		}

	}

	public void method6() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("=======메뉴=======");
			System.out.println("1. 1~5출력");// method1
			System.out.println("2. 1~10사이의 홀수만 출력");// method2
			System.out.println("3. 1부터 랜덤한 값(1~10)합계 구하기");// method3
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴선택 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				method1();
				break;
			case 2:
				method2();
				break;
			case 3:
				method3();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못입력하셨습니다");
				break;
			}
		}
	}
	
	public void method7() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		while(true) {
			System.out.println("문자열 입력");
			String input = sc.nextLine();
			if(input.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			str += input;
			System.out.println(str);
			
		}
		
		
	}

}
