package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	// break : 가장 가까운 반복문을 빠져나가는 문구
	// 단 switch문안의 break는 switch안을 빠져나감
	public void method1() {
		Scanner sc = new Scanner(System.in);

//		for(;;) {
//			System.out.println("문자열 입력 :");
//			String str = sc.nextLine();
//			System.out.println(str);
//		}
		while (true) {
			System.out.println("문자열 입력 :");
			String str = sc.nextLine();
			if (str.equals("exit")) {
				break;
			}

			System.out.println("문자열 길이 : " + str.length());

		}
		// 무한반복문안에서 break가 없으면 도달할 수 없다(unreachable code)라고 오류가 뜸
		System.out.println("프로그램 종료");
	}

	public void method2() {
		while (true) {
			int random = (int) (Math.random() * 10 + 1);
			System.out.println("랜덤값 : " + random);

			if (random % 2 == 1) {
				break;
			}

		}
		System.out.println("홀수가 나왔기때문에 종료");
	}

	public void method3() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println();
			System.out.println("피연산자 1 입력 : ");
			int num1 = sc.nextInt();
			System.out.println("피연산자 2 입력 : ");
			int num2 = sc.nextInt();
			sc.nextLine();

			System.out.println("연산자를 입력");
			char op = sc.nextLine().charAt(0);

			switch (op) {
			case '+':
				System.out.printf("%d %c %d = %d", num1, op, num2, num1 + num2);
				break;
			case '-':
				System.out.printf("%d %c %d = %d", num1, op, num2, num1 - num2);
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				return;
			}
		}
	}

	public void yap() {

		int random = (int) (Math.random() * 100 + 1);
		System.out.println("랜덤값 : " + random);

		if (random < 73) {
			System.out.println("A-1");
		} else if (random < 81) {
			System.out.println("A-2");
		} else if (random < 95) {
			System.out.println("A-3");
		} else {
			System.out.println("A-4");
		}

	}

}
