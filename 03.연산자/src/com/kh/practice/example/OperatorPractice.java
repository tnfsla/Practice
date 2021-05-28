package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int num = sc.nextInt();
		
		String result = (num >0) ? "양수이다. " : "양수가 아니다.";
		
		System.out.println(result);
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int num = sc.nextInt();
		
		String result = (num >0) ? "양수이다. " : (num == 0) ? "0이다.":"음수이다";
		
		System.out.println(result);
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int num = sc.nextInt();
		
		String result = (num %2==0)?"짝수이다":"홀수이다.";
		System.out.println(result);
		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("인원 수 : ");
		int p = sc.nextInt();
		
		System.out.println("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 :"+(int)(candy / p));
		System.out.println("남는 사탕 개수 : "+(candy%p));
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("학년(숫자만) :");
		int grade = sc.nextInt();
		System.out.println("반(숫자만) :");
		int cls = sc.nextInt();
		System.out.println("번호(숫자만) :");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println("성별(M/F)");
		char gender = sc.nextLine().charAt(0);
		System.out.println("성적(소수점 아래 둘째 자리까지)");
		double score = sc.nextDouble();
		
		char genderK = (gender=='M') ? '남' : '여';
		
		System.out.println(grade+"학년 "+cls+"반 "+num+"번 "+name+" "+genderK+"학생의 성적은 "+score+"이다.");
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 :");
		int age = sc.nextInt();
		
		String result = (age <=13) ? "어린이" : (age<=19) ? "청소년" : "성인";
		System.out.println(result);
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 : ");
		int k = sc.nextInt();
		System.out.println("영어 : ");
		int e = sc.nextInt();
		System.out.println("수학 : ");
		int m = sc.nextInt();
		int sum = k+e+m;
		double avg = (k+e+m)/3.0;
		
		String result = (k>=40 && e>=40 && m>=40 && avg>=60)? "합격" : "불합격";
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println(result);
		
	
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요 (- 포함) : ");
		String num = sc.nextLine();
		
		String result = (num.charAt(7)=='1')? "남자" : (num.charAt(7)=='2')?"여자" : "잘못 입력하셨습니다.";
		System.out.println(result);
		
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 1 : ");
		int num1 = sc.nextInt();
		System.out.println("정수 2 : ");
		int num2 = sc.nextInt();
	
		System.out.println("입력 : ");
		int input = sc.nextInt();
		
		boolean result = (input <= num1 || input >= num2);
		
		System.out.println(result);
		
		
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 1 : ");
		int num1 = sc.nextInt();
		System.out.println("입력 2 : ");
		int num2 = sc.nextInt();
		System.out.println("입력 3: ");
		int num3 = sc.nextInt();
		
		boolean result = (num1 == num2 &&num1 == num3 );
		System.out.println(result);
		

		
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("A사원의 연봉 : ");
		int a = sc.nextInt();
		System.out.println("B사원의 연봉 : ");
		int b = sc.nextInt();
		System.out.println("C사원의 연봉 : ");
		int c = sc.nextInt();
		double a1 = a*1.4;
		double b1 = (double)b;
		double c1 = c*1.15;
		String result1 = (a1>=3000)? "3000 이상" : "3000 미만";
		String result2 = (b1>=3000)? "3000 이상" : "3000 미만";
		String result3 = (c1>=3000)? "3000 이상" : "3000 미만";
		
		System.out.println("A사원의 인센티브 포함 연봉 : "+a1);
		System.out.println(result1);
		System.out.println("B사원의 인센티브 포함 연봉 : "+b1);
		System.out.println(result2);
		System.out.println("C사원의 인센티브 포함 연봉 : "+c1);
		System.out.println(result3);
		
		
	}
	
}
