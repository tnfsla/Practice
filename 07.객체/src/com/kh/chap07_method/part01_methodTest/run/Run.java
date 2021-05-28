package com.kh.chap07_method.part01_methodTest.run;

import com.kh.chap07_method.part01_methodTest.controller.NonStaticMethod;
import com.kh.chap07_method.part01_methodTest.controller.StaticMethod;
import com.kh.chap6_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticMethod n = new NonStaticMethod();
//		1. 매개변수 없고, 반환값 없는 메소드 호출
		n.method1();
		
//		2. 매개변수 없고, 반환값 있는 메소드 호출
//		반환값이 있으니 변수에 저장해야함
		String str = n.method2();
		System.out.println("str : "+str);
		
//		3.매개변수 있고 반환값이 없는 메소드
		n.method3(3, 4);
		
//		4.매개변수가 있고 반환값도 있는 메소드
		System.out.println(n.method4(5, 7));
		
		User u1 = new User("user01","pass01","김남길");
		System.out.println(u1.information());
		
		n.method(u1);
		System.out.println(u1.information());
		
		
		
//		StaticMethod
//		static메소드는 객체생성할 필요 없음. 아래처럼 안해도 됌	
//		StaticMethod sm = new StaticMethod();
		
		//아래처럼 바로 선언이 가능하다.
		StaticMethod.method1(); //<전달값이 있으면 넣고 없음 말고~
		System.out.println(StaticMethod.method2());
		StaticMethod.method3("문대훈");
		System.out.println(StaticMethod.method4("문대훈"));
		
		
		
		
	}

}
