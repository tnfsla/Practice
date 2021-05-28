package com.kh.chap07_method.part02_OverloadoingTest;

public class OverloadingTest {
	// 오버로딩 : 한클래스 내에 같은 메소드명으로 정의할 수 있는 방법
	public void test() {

	}

	public void test(int a) {

	}

	public void test(int a, String s) {

	}

	public void test(String s, int a) {

	}

	public void test(int a, int b) {

	}

//	public void test(int c, int d) {
//
//	}  자료형 타입 동일한게 있으므로 불가

	public void test(int a, int b, String str) {

	}
	
//	public int test(int a, int b, String str) {
//		
//	} 반환형이 다르지만 오버로딩 적용 안됨.(매개변수 동일)
	
//	private void test(int a, int b, String str) {
//		
//	} 접근제한자가 다르지만 오버로딩이 적용되지 않는다.(매개변수 동일)

	/*
	 * 결론 : 오버로딩 - 동일한 메소드명, 매개변수의 자료형과 갯수, 순서가 달라야 함 
	 * (접근제한자, 반환형은 상관 없음)
	 */
	
	
	
	
}
