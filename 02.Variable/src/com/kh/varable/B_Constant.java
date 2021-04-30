package com.kh.varable;

public class B_Constant { // 상수 선언 final int AGE = 15; 절대 변하지 않는 값이며, 변수명은 all 대문자

	public void finalConstant() {
		int age =20;
		System.out.println("age : "+age);
		
		age= 30;
		System.out.println("age : "+age);

		final int AGE = 20;
		System.out.println(AGE);
		// AGE = 30; 오류발생 상수이기 때문에
	}

}
