package com.kh.chap03_class.run;

import java.util.Scanner;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person p = new Person();
//		p.setId("tnfsla");
//		p.setName("문대훈");
//		p.setPwd("tnf");
//		p.setAge(26);
//		p.setGender('M');
//		p.setPhone("010-3928-9501");
//		p.setEmail("tnfsla@naver.com");
//		System.out.println(p.information());
//		
//		System.out.println(p.getAge());
//		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("변경할 이름 : ");
//		String name = sc.nextLine();
//		p.setName(name);
//		
//		System.out.println(p.information());
		
		Product g = new Product();
		Product i = new Product();
		
		i.setBrand("애플");
		i.setName("아이폰8");
		i.setPrice(800000);
		g.setBrand("삼성");
		g.setName("갤럭시10");
		g.setPrice(760000);
		
		System.out.println(i.information());
		System.out.println(g.information());
		
		//DftProduct d= new DftProduct();  default는 타 패키지에서 접근 불가
		

	}

}
