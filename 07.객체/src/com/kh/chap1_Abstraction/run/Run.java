package com.kh.chap1_Abstraction.run;

import com.kh.chap1_Abstraction.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//만약 변수만을 가지고 프로그램에 필요한 객체를 만들어낸다고 한다면 아래처럼.
		String name1 = "유산슬";
		int age1 = 20;
		int kor1 = 80;
		int math1 = 90;
		
		String name2 = "유야호";
		int age2 = 21;
		int kor2 = 100;
		int math2 = 80;
		
		
		//BUT
		Student st = new Student(); //-> 객체생성 : new연산자를 통해 heap
									// 			 영역에 공간이 만들어짐
		st.name = "문대훈";
		st.age = 26;
		st.height = 171.3;
		st.kor = 100;
		st.math = 100; //^^
		
		//직접 접근을 통해 값을 가져오기
		System.out.println(st.name + "님의 나이는 "+st.age+"세이고, 키는 "+st.height+"입니다.");
		
		Student a = new Student();
		
		a.name = "정효림";
		a.age = 25;
		a.height = 155;
		a.kor=100;
		a.math=50;
		
		/*
		 * 외부에서 직접 접근을 통해 값을 변경 할 수도 있다 -> 안되게 해야한다.
		 * 즉 ,public으로 작업을 하게되면 외부에서 직접접근을 통해서 값이 변질되거나 마음대로 조회가 가능하다.
		 * --> private으로 선언하고 캡슐화 작업을 해서 해결하자.
		 * --> 객체지향 설계원칙 - 정보은닉 기술 중 일부분이 캡슐화
		 */
	}

}
