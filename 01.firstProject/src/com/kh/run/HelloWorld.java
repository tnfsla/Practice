package com.kh.run;

public class HelloWorld {

	// 1줄 주석 ctrl + / 

	/* 전체 주석  ctrl + shift + / 
	 * 1 2
	 */
	
	
//	public : 메소드를 외부에서 호출할 수 있게함
//	static : 객체를 생성하지 않고도 실행시킬 수 있다.
//	void : 반환값이 없다 비어있다.
//	String[] args : 파라미터, 실행명령어 외에 인자를 받을 수 있는데 스트링 배열로 들어가게 된다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HI~~~");
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		System.out.print("안녕하세요\n");
		System.out.print("반갑습니다");
	}

}