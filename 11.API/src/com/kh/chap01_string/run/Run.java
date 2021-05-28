package com.kh.chap01_string.run;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Run.method1();
		new Run().method2();
	}
	
	private void method2() {
		// TODO Auto-generated method stub
		String str = "abc";

//		- charAt(해당 인덱스 ): 문자뽑아내기
		System.out.println(str.charAt(2)); // c 출력
		
//		- concat : 문자열 합치기
		System.out.println(str.concat("def"));
//		str = str.concat("def");  // 이런식으로 하면 합쳐짐
		
//		- contains : 포함여부 확인하기
		System.out.println(str.contains("ab"));
		
//		- equals : 동등여부 확인하기
		System.out.println(str.contentEquals("abc"));
		
//		- length() : 문자열길이
		System.out.println(str.length());
		
//		- split : 문자 구분(특수한 기호를 기준으로 각각 문자열 배열로 쪼개서 반환해줌)
		String str1 = "a,bc,de";
		String[] strArr = str1.split(",");
		
		for(int i = 0; i<strArr.length ; i++) {
			System.out.println(strArr[i]);
		}
		
		for(String arr : strArr) {
			System.out.println(arr);
		}
		
//		- toUpperCase : 전부 대문자로 반환
//		- toLowerCase : 전부 소문자로 반환
//		- equalsIgnoreCase : 대소문자 상관없이 문자열 비교(boolean반환)
		
		String strCase1 = "Abc";
		String strCase2 = "aBc";
		System.out.println(strCase1.toUpperCase());
		System.out.println(strCase2.toLowerCase());
		System.out.println(strCase1.equalsIgnoreCase(strCase2));
		
//		- trim : 문자얄 양쪽 공백 제거
		String str2 = "      ab c      ";
		System.out.println(str2);
		System.out.println(str2.trim());
	}

	private static void method1() {
		//1. 문자열을 리터럴로 생성
		String str = "abc"; //heap 생성

		String str1 = "abc"; // 동등한값은 같은 주소값 가지고있음.
		
		String str2 = "def";
		
		//2. 문자열을 new 생성자()로 생성
		String str3 = new String("abc"); //새로운 객체생성이므로 해시코드가 다르게 출력됨
		
		String str4 = new String("abc");
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}

}
