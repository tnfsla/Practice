package com.kh.chap02.loop;

import java.util.Random;
import java.util.Scanner;

public class A_For {
	/*
	 * 반복문 : 프로그램의 수행흐름을 제어하는 제어문중 하나, 어떤 실행코드를 반복적으로 수행시켜준다.
	 * 
	 * for문/while문( do- while문)
	 * 
	 * *for문
	 * 
	 * for(초기식;조건식;증감식){//반복 횟수를 지정하기위해서 제시하는것들 ..반복적으로 실행시키고자 하는 실행 구문..
	 * 
	 * }
	 * 
	 * -초기식 : 반복문이 수행될때 "단 한번만 실행되는 구문" (보통 반복문 안에서 사용될 변수를 선언하고 초기값을 대입하는 구문) -조건식
	 * : "반복문이 수행될 조건" 을 작성하는 구문 조건식이 true일 경우 해당 실행 구문을 실행 조건식이 false일 경우 반복을 멈추고
	 * 빠져나옴 (보통 초기식에서 사용된 변수를 가지고 조건식을 작성) -증간식 : 반복문을 제어하는 변수값을 증감시키는 부분 (주로 초기식에
	 * 제시한 변수를 가지고 증감 연산자 사용)
	 * 
	 * 
	 * for문 초기식--> 조건식 검사 -> true일 경우 실행구문을 실행 --> 증감식 --> 조건식 검사 -> true일 경우 실행구문을
	 * 실행 --> 증감식 --반복-- --> 조건식 검사 -> false일 경우 실행구문을 실행 하지 않음 --> 반복문을 빠져나옴
	 * 
	 * * 알아둘것 ~ for 문안에 있는 초기식, 조건식, 증감식은 모두 생략 가능 하긴 함(하지만 ; 은 반드시 필수 작성) 즉,for()
	 * 안에서만 생략 될뿐 모두 필요한 요소임.
	 */
	public void method1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("안녕하세요" + i);
		}
		for (int i = 1; i <= 5; i++) {
			System.out.println("안녕하세요" + i);
		}
	}

	public void method2() {
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		for (int i = 5; i >= 1; i--) {
			System.out.print(i + " ");
		}

	}

	public void method3() {
		// 1~10사이 홀수만 출력
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i + " ");
		}

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i + " ");
			}
		}
	}

	public void method4() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}

	public void method5() {
		// 1~10까지 합
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

	public void method6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}

		System.out.println(sum);
	}

	public void method7() {
		/*
		 * java.lang.Math 클래스에서 제공하는 random()메소드를 사용해서 랜덤값 발생시킬 수 있다.
		 * 
		 * Math.random() 호출시 --> 0.0 ~ 0.999999 사이의 랜덤값 발생 시켜줌 (0.0 <= 랜덤값 < 1.0)
		 */

		// int random = Math.random(); // double형이라서 안됨
		// 0.0 <= < 1.0 --> 0.0 ~ 0.99999...

		// int random = Math.random() * 10;
		// 0.0 <= < 10.0 --> 0.0 ~ 9.99999...

		// int random = Math.random() * 10 + 1;
		// 1.0 <= < 11.0 --> 1.0 ~ 10.9999...

		// 1 <= < 11 --> 1 ~ 10 Random);

		int ran = (int) (10 * Math.random() + 1);
		int sum = 0;
		for (int i = 1; i <= ran; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public void method8() {
		// 사용자에게 문자열 입력 받아서 각 인덱스별로 문자를 각각 추출
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 : ");
		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) { // .length() 길이 확인
			System.out.println(str.charAt(i));
		}
	}

	public void method9() {
		// 2단 출력하기
		for (int i = 1; i <= 9; i++) {
			System.out.println("2*" + i + "=" + 2 * i);
		}
	}

	public void method10() {
		// 사용자가 입력한 단 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int num = sc.nextInt();

		if (num > 1 && num < 10) {
			for (int i = 1; i <= 9; i++) {
				//System.out.println(num+"*"+i+"="+num*i);
				System.out.printf("%d * %d = %d\n",num,i,num*i);
			}
		}else {
			System.out.println("2~9사이의 양수 입력");
		}
	}

	public void method11() {
		//2~9사이 랜덤단을 출력
		int num = (int) (8 * Math.random() + 2);
		if (num > 1 && num < 10) {
			for (int i = 1; i <= 9; i++) {
				//System.out.println(num+"*"+i+"="+num*i);
				System.out.printf("%d * %d = %d\n",num,i,num*i);
			}
		}else {
			System.out.println("2~9사이의 양수 입력");
		}
	
	}
	// 중첩 for문
			/*
			 * for(초기식1; 조건식1; 증감식1) {
			 * 		수행할 문장 1;
			 * 	
			 * 		for(초기식2; 조건식2; 증감식2){
			 * 			수행할 문장 2;
			 * 		}
			 * 
			 * 		수행할 문장 3;
			 * }
			 * 
			 */
	public void method12() {
		//1 2 3 4 5 를 3번출력
		for(int i = 0 ; i<3 ; i++) {
			for(int j = 1 ; j<=5; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public void method13() {
		//2단부터 9단까지
		for(int i = 2; i<=9; i++) {
			System.out.println("=============="+i+"단================");
			for(int j = 1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
	}
	
	public void method14() {
		for(int i = 1; i<=4;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method15() {
		for(int i = 1; i<=4;i++) {
			for(int j=1;j<=i;j++) {
				
					System.out.print("*");
				
				
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
