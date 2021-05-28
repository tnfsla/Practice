package com.kh.chap05_math.run;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//상수 : 파이
		System.out.println("PI : "+Math.PI);
		
		//절대값 (abs)
		int num1 = -10;
		System.out.println(Math.abs(num1));
		
		//올림 (ceil)
		double num2 = 4.349;
		System.out.println(Math.ceil(num2));
		
		//반올림 (round)
		System.out.println(Math.round(num2));
		
		//버림 (floor)
		System.out.println(Math.floor(num2));
		
		//가장 가까운 정수값 (rint)									//rint와 round는 음수를 다뤘을때 차이가 난다.
		System.out.println(Math.rint(num2));
		
		//제곱근 (sqrt)
		System.out.println(Math.sqrt(num2));
		
		//제곱 (pow)  (숫자, 지수)
		System.out.println(Math.pow(num2, 2));
		
	}

}
