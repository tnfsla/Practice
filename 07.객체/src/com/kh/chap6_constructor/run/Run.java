package com.kh.chap6_constructor.run;

import com.kh.chap6_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User a = new User("user00","pw11","문대훈");
		System.out.println(a.information()); //age와 gender는 초기값이 담겨있음 (0,  )
		a.setAge(26);
		a.setGender('M');
		System.out.println(a.information());

		//다른 매개변수 생성자로 객체 생성
		User u3 = new User("user01", "pass01", "머훈", 24, 'm');
		System.out.println(u3.information());
	
	
	}

}
