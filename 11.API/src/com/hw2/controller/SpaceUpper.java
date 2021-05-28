package com.hw2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {

	public SpaceUpper() {
		// TODO Auto-generated constructor stub
	}
	
	public void spaceToUpper() {
		Scanner sc = new Scanner(System.in);
		System.out.println("영어를 입력하시오 (띄어쓰기 포함)");
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str," ");
		String whStr = "";
		String result = "";
		while(st.hasMoreTokens()) {
			whStr = st.nextToken();
			StringBuilder sb = new StringBuilder(whStr);
			sb.setCharAt(0, whStr.toUpperCase().charAt(0));
			result += sb.toString()+" ";
		}
		
		System.out.println(result);
	}
}
