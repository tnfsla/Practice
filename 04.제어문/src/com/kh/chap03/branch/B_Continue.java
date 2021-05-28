package com.kh.chap03.branch;

public class B_Continue {
	//continue : 반복문안에서 사용하며, 만나면 이후는 실행하지 않고 반복문 첫자리로 다시 돌아감(조건문에 사용)
	
	public void method1() {
		for(int i = 1; i<=10 ;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
			
		}
	}
	
	public void method2() {
		//1~100 정수합 출력
		// 6의 배수 제외 덧셈연산
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			if(i%6==0) {
				continue;
			}
			sum+=i;
		}
		System.out.println(sum);
	}

	public void method3() {
		for(int i =2; i<=9; i++) {
			if(i == 4) continue;
			for(int j = 1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+j*i);
			}
		}
	}
	
	public void method4() {
		for(int i =2; i<=9; i++) {
			if(i %2== 0) continue;
			for(int j = 1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+j*i);
			}
		}
	}
}
