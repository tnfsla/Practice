package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;
import com.kh.chap04_field.model.vo.FieldTest4;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//-------1 FieldTest1
		FieldTest2 ft = new FieldTest2();
//		ft.test(10);

		
//		---------2. FieldTest2
		// 어디서든 접근가능 -> public -> getter,setter 필요없음
		System.out.println(ft.pub);

		// protect 다른패키지면서 상속구조가 아니어서 접근 불가함
//		System.out.println(ft.pro);
		System.out.println(ft.getPro()); // getter 사용

		// default 같은 패키지 내에서 가능하므로 접근불가
//		System.out.println(ft.def); // 다른패키지이기 때문에 불가능
		System.out.println(ft.getDef()); // getter 사용

		// private 같은 클래스 내에서만 접근 가능
//		System.out.println(ft.pri()); //다른 클래스이므로 접근 불가
		System.out.println(ft.getPri()); // getter 사용

		
		
		//-------------------3번
//		객체 생성과정 (nonstatic)
//		FieldTest3 f3 = new FieldTest3();
//		System.out.println(f3.pubsta);
			
//		static은 아래 처럼 바로 객체 생성없이 가능함
		System.out.println(FieldTest3.pubsta);
		//신기쓰방기쓰
		
		//private은 다른것과 마찬가지로 get,set 사용해야함
		System.out.println(FieldTest3.getPrista());
		
		
//		----------------------4번
		System.out.println(FieldTest4.NUM); //객체생성 안해도 되는 너낌이죠? static final
		
	}

}
