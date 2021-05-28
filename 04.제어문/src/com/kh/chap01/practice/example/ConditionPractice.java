package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");

		System.out.println("메뉴번호를 입력하세요");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 9:
			System.out.println("프로그램이 종료됩니다.");
			break;

		}
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 한개 입력하세요");
		int num = sc.nextInt();

		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수다.");
			} else {
				System.out.println("홀수다.");
			}
		} else {
			System.out.println("양수만 입력해 주세요");
		}

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 : ");
		int k = sc.nextInt();
		System.out.println("영어 점수 : ");
		int e = sc.nextInt();
		System.out.println("수학 점수 : ");
		int m = sc.nextInt();

		int sum = k + e + m;
		double avg = (k + e + m) / 3;

		if (sum >= 40) {
			if (avg >= 60) {
				System.out.println("국어 : " + k);
				System.out.println("수학 : " + m);
				System.out.println("영어 : " + e);
				System.out.println("합계 : " + sum);
				System.out.println("평균 : " + avg);
				System.out.println("축하합니다, 합격입니다!");
			} else {
				System.out.println("불합격입니다.");
				return;
			}
		} else {
			System.out.println("불합격입니다.");
		}

	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~12월 사이의 정수 입력: ");
		int month = sc.nextInt();

		switch (month) {
		case 1:
		case 2:
		case 12:
			System.out.println(month + "월은 겨울입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "월은 가을입니다.");
			break;
		default:
			System.out.println(month + "월은 잘못 입력된 달입니다.");
			break;

		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 : ");
		String ID = sc.nextLine();
		System.out.println("비밀번호 : ");
		int pw = sc.nextInt();

		if (ID.equals("user1")) {
			if (pw == 1234) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("권한을 확인하고자 하는 회원 등급 : ");
		String lv = sc.nextLine();
		switch (lv) {
		case "관리자":
			System.out.println("회원관리, 게시글관리");
		case "회원":
			System.out.println("게시글 작성, 댓글작성");
		case "비회원":
			System.out.println("게시글 조회");
			break;
		default:
			System.out.println("잘못 입력하였습니다.");
		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("키를 입력해 주세요(m) : ");
		double height = sc.nextDouble();
		System.out.println("몸무게 (kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();

		double BMI = weight / (height * height);
		System.out.println("BMI지수 : " + BMI);
		if (BMI < 18.5) {
			System.out.println("저체중");
		} else if (BMI < 23) {
			System.out.println("정상 체중");
		} else if (BMI < 25) {
			System.out.println("과체중");
		} else if (BMI < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("피연산자 1 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("피연산자 2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();

		System.out.println("연산자를 입력");
		char op = sc.nextLine().charAt(0);

		switch (op) {
		case '+':
			System.out.printf("%d %c %d = %d",num1,op,num2,num1+num2);
			break;
		case '-':
			System.out.printf("%d %c %d = %d",num1,op,num2,num1-num2);
			break;
		case '*':
			System.out.printf("%d %c %d = %d",num1,op,num2,num1*num2);
			break;
		case '/':
			System.out.printf("%d %c %d = %d",num1,op,num2,num1/num2);
			break;
		case '%':
			System.out.printf("%d %c %d = %d",num1,op,num2,num1%num2);
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			break;

		}

	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("중간고사 점수 :");
		double mid = sc.nextDouble();
		System.out.println("기말고사 점수 :");
		double last = sc.nextDouble();
		System.out.println("과제 점수 :");
		double hw = sc.nextDouble();
		System.out.println("출석 횟수 :");
		double att = sc.nextDouble();
		
		mid *= 0.2;
		last *= 0.3;
		hw *= 0.3;
		
		double sum = mid + last + hw + att;
		
		if(sum>=70) {
			if(att>=14) {
				System.out.println("==========결과=========");
				System.out.println("중간 고사 점수 (20) : "+mid);
				System.out.println("기말 고사 점수 (30) : "+last);
				System.out.println("과제 점수 (30) : "+hw);
				System.out.println("출석 점수 (20) : "+att);
				System.out.println("총점 :"+sum);
				System.out.println("PASS");
			}else {
				System.out.println("FAIL[출석 횟수 부족] ("+att+"/20)");
			}
		}else if (att<14) {
			System.out.println("FAIL[출석 횟수 부족] ("+att+"/20)");
			System.out.println("FAIL[점수 미달] (총점 "+sum+")");
		}else {
			System.out.println("FAIL[점수 미달] (총점 "+sum+")");
		}
	}
	
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		
		System.out.println("선택 : ");
		int num = sc.nextInt();
		switch(num) {
		case 1: 
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:			
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
