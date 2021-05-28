package com.kh.hw1.view;

import java.util.Scanner;

import com.kh.hw1.controller.TokenController;

public class TokenMenu {
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();

	public void mainMenu() {
		while (true) {
			System.out.println("1. 지정 문자열"); //  tokenMenu() 실행
			System.out.println("2. 입력 문자열"); //  inputMenu() 실행
			System.out.println("9. 프로그램 끝내기");
			System.out.println("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				tokenMenu();
				break;
			case 2:
				inputMenu();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다 다시 입력하세요");
				break;
			}
		}
	}

	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
		System.out.println("토큰 처리 전 글자 : "+str);
		System.out.println("토큰 처리 전 개수 : "+str.length());
		String result = tc.afterToken(str);
		System.out.println("토큰 처리 후 글자 : "+result);
		System.out.println("토큰 처리 후 개수 :"+result.length());
		System.out.println("모두 대문자로 변환 : "+result.toUpperCase());
		// Token 처리 전 글자와 글자 개수를 출력하고
		// 위 str을 TokenController의 afterToken() 메소드의 인자로 보내 반환 값 출력
		// 그 반환 값을 이용해 Token 처리 후 글자 개수와 대문자 변환한 것을 출력

	}

	public void inputMenu() {
		System.out.println("문자열을 입력하시오. : ");
		String str = sc.nextLine();
		System.out.println("첫 글자 대문자 : "+tc.firstCap(str));
		System.out.println("찾을 문자를 입력하시오 : ");
		char ch = sc.nextLine().charAt(0);
		System.out.println(ch+"문자가 들어간 개수 : "+tc.findChar(str, ch));

	}

}
