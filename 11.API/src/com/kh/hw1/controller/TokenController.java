package com.kh.hw1.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str," ");
		String whStr = "";
		while(st.hasMoreTokens()) {
			whStr = whStr+st.nextToken(); 
		}
		
		return whStr;
	}
	
	public String firstCap(String input) {
		StringBuilder sb = new StringBuilder(input);
		sb.setCharAt(0, input.toUpperCase().charAt(0));
		
		String result = sb.toString(); //string builder 를 string 형으로 바꾸기
		return result;
				
	}
	
	public int findChar(String input, char one) {
		int cnt = 0;
		for(int i =0; i<input.length(); i++) {
			if(input.charAt(i)==one) {
				cnt++;
			}
		}
		return cnt;
		
	}
	

}
