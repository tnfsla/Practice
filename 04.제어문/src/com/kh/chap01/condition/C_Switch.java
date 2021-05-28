package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {

	/*
	 * * switch문
	 * 
	 * switch(동등비교할대상자){ // 여기서 동등비교할 대상자는 반드시 int값이나, char, String 만가능!! case 값1 :
	 * 실행코드1; break; case 값2 : 실행코드2; break; case 값3 : 실행코드3; break; ... default :
	 * 위의 조건에 다 만족하지 않을 경우 실행할 코드; }
	 * 
	 * 비교할대상자 == 값1 인 경우 실행코드1을 실행하고 break를 만나 빠져나간다. if-else if문과 달리 실행코드 실행하고 자동으로
	 * 빠져나가지 못함.. break를 걸어줘야됨
	 */

	public void method1() {
		// 1-3 정수를 입력받아 /
		// 1의 경우 빨간색입니다
		// 2 파란색입니다.
		// 3 초록색입니다.
		// 잘못입력 : 잘못입력했습니다
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int num = sc.nextInt();
//		if(num == 1) {
//			System.out.println("빨간색 입니다.");
//		}else if (num == 2) {
//			System.out.println("파란색 입니다.");
//		}else if (num == 3) {
//			System.out.println("초록색 입니다.");
//		}else{
//			System.out.println("잘못입력하였습니다.");
//		}

		switch (num) {
		case 1:
			System.out.println("빨간색 입니다.");
			break;
		case 2:
			System.out.println("파란색입니다.");
			break;
		case 3:
			System.out.println("초록색입니다.");
			break;
		default:
			System.out.println("잘못입력 하였습니다.");
			break;
			

		}
	}
	
	public void method2() {
		// 키보드로 과일 이름을 입력받아서 fruit +" 가격은 "+price+"입니다."
		Scanner sc = new Scanner(System.in);
		System.out.println("과일 이름 : ");
		String fruit = sc.nextLine();
		
		int price = 0;
		switch (fruit) {
		case "딸기" :
			price = 1000;
			break;
		case "사과" :
			price = 2000;
			break;
		case "키위" :
			price = 3000;
			break;
		case "바나나" :
			price = 4000;
			break;
		default : 
			System.out.println("잘못 입력하였습니다.");
			return;
		}
		
		System.out.println(fruit +" 가격은 "+price+"입니다.");
		
	}

	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1월~12월 중 하나를 입력하세요: ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일까지");
			break;
		case 4:
		case 6:
		case 9:
		case 11: 
			System.out.println("30일까지");
			break;
		case 2:
			System.out.println("28일까지");
			break;
		default : 
			return;
			
		}
		
	}
}
































