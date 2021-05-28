package com.kh.myException.run;

import java.util.Scanner;

import com.kh.myException.exception.MyException;

public class Run {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		try {
			checknum(num);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//checkNum
	//10보다 작은수일경우 : My(Exception("10보다 작은 수입니다") 발생
	//아닌 경우 syso : 10보다 크거나 같은 수구나!

	private static void checknum(int num) throws MyException {
		// TODO Auto-generated method stub
		
		if(num <10) {
			throw new MyException("10보다 작은 수입니다.");
	
		}else {
			System.out.println("10보다 크거나 같은 수다");
		}
	}

}
