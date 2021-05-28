package com.hw5.model.vo;

import java.util.Scanner;

public class NumberOk {
	private int ran;

	public NumberOk() {
		// TODO Auto-generated constructor stub
	}

	public void numGame() {
		Scanner sc = new Scanner(System.in);
		int ran = (int)(Math.random()*100+1);
		int count = 0;
		while (true) {
			System.out.println("1부터 100사이의 정수를 입력하세요 : ");
			int num = sc.nextInt();
			if(ran > num) {
				System.out.println(num+"보다 큽니다. "+(++count)+"번째 실패!!");
			}else if (ran < num) {
				System.out.println(num+"보다 작습니다. "+(++count)+"번째 실패!!");
			}else {
				System.out.println((count++)+"번만에 맞췄습니다!");
				return;
			}
		}
	}

}
