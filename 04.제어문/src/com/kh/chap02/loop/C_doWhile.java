package com.kh.chap02.loop;

import java.util.Scanner;

public class C_doWhile {
	/*
	 * * do-while문
	 * 
	 * [초기식]
	 * 
	 * do{ 반복적으로 실행할 코드;
	 * 
	 * [증감식]
	 * 
	 * }while(조건식);
	 * 
	 * 
	 * 초기식 --> 무조건 한번은 실행 --> 증감식 조건식 --> true일 경우 실행 --> 증감식 조건식 --> true일 경우 실행
	 * --> 증감식 조건식 --> false일 경우 빠져나감
	 * 
	 * while문과 다른 점은 while문은 처음 수행될때도 조건식을 검사하고 나서 조건식이 true일 경우 실행되는데 do while문은 첫
	 * 실행은 조건식없이 무조건 수행된다는 점
	 * 
	 */
	public void method1() {
		// 조건이 맞지 않아도 1번 수행한다.

		int num = 1;
		do {
			System.out.println(num);

		} while (num == 0);
	}

	public void method2() {
		int num = 1;
		do {
			System.out.println(num);
			num++;
		} while (num <= 5);
	}

	public void method3() {
		int random = ((int) (Math.random() * 10) + 1);
		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i++;

		} while (i <= random);

		System.out.println(sum);
	}

	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇단 ? : ");
		int num = sc.nextInt();
		int i = 1;
		System.out.println("=========" + num + "단========");
		do {
			System.out.println(num + " * " + i + " = " + num * i);
			i++;
		} while (i <= 9);
	}

	public void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력");
		String str = sc.nextLine();
		int i = 0;
		do {
			System.out.println(str.charAt(i));
			i++;
		} while (i < str.length());
	}

	public void method6() {
		Scanner sc = new Scanner(System.in);

		do {
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
		}while (true) ;
		
	}
	
	public void method7() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		do {
			System.out.println("문자열 입력");
			String input = sc.nextLine();
			if(input.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			str += input;
			System.out.println(str);
			
		}while(true);
		
		
	}

}
