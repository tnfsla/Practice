package com.kh.chap01_list_part01_basic.run;

import java.util.ArrayList;
import java.util.Date;

public class Run {
	// TODO Auto-generated method stub
			/*
			 *  1. 컬렉션 프레임워크란?
			 *  	- java.util 패키지에 포함 됨
			 *  	- 다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합
			 *  		(데이터를 저장하는 자료 구조와 데이터를 처리하는 알고리즘을 구조화(틀) 해 놓음)
			 *  
			 *  2. 배열의 단점과 컬렉션의 장점
			 *  	- 배열의 단점
			 *  	 a. 한번 크기를 지정하면 변경(x), 처음에 크기 지정(o)
			 *  	 b. 배열 중간에 추가, 삭제가 불편하다.
			 *  	 c. 한 타입만 저장 가능
			 *  
			 *  	- 컬렉션의 장점
			 *  	 a. 저장하는 크기의 제약이 없다.
			 *  	 b. 추가, 삭제, 정렬 등의 기능처리가 간단하다.
			 *  	 c. 여러 타입을 저장 가능 (**기본 자료형은 Wrapper 클래스**로써 저장 됨 : 객체만 저장 되기 때문)
			 */
			
			
			/*List : 자료를 저장하는 구조 형태중 순서가 유지되고 중복을 허용 하는 자료 구조 기법을 말한다 
			 *  자바에서는 ArrayList,Vector,LinkedList 등이있다 
			 *  이중 ArrayList 와 Vector 는 기능이 동일하나
			 *  Vector 는 ThreadSafe 기능이 있고  ArrayList는 ThreadSafe 기능이 없는 클래스이다 //ThreadSafe기능이 있으면 속도적으로 하향있다. 동시실행이 좋음
			 *  
			 *  ThreadSafe: 동시에 실행했을때 누가 먼저하라고 우선순위를 정해줌
			 */
			
			
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		//List a1 = new ArrayList();  List가 상위클래스라 가능
		//Vector a1 = new Vector();
		//LinkedList a1 = new LinkedList(); // 앞뒤 링크만 확인하며 저장하는 구조, 인접한 참조를 링크해서 체인처럼 관리하고 객체를 중간에 추가, 제거할때 용이하다.
		
//		add() : 데이터 추가, 다양한 자료형 들어감 (오토박싱해서 Wrapper클래스로 변환)
//		컬렉션은 객체타입만 받아주기때문에 기본 자료형을 추가하면 내부적으로 AutoBoxing에 의해 WrapperClass로 변형되어 객체로 들어간다.
		a1.add(true);
		a1.add("이효리");
		a1.add('여');
		a1.add(20);
		a1.add(new Date());
		
//		get(index) : ArrayList의 값 추출
		for(int i = 0 ; i < a1.size() ; i++) {
			System.out.println(i+"번째 값 : "+a1.get(i));			
		}
		
		System.out.println(a1.toString());// => 오버라이딩 되어서 쉼표로 구분해서 반환해줌
		
//		remove(index) : 해당 번재 값 삭제
		a1.remove(1);
		System.out.println(a1.toString());
		
//		add(index, value) : 원하는 인덱스 번호에 값을 추가
		a1.add(3, 37.85);
		System.out.println(a1.toString());
		
//		set(index, value) : 원하는 인덱스 번호의 값을 변경
		a1.set(3, "aaa");
		System.out.println(a1.toString());
		
//		isEmpty() : 비어있는 컬렉션인지 확인 - 비었으면 true 차있으면 false
		System.out.println(a1.isEmpty()); // 
		
//		indexOf(value) : value가 들어있는 index를 반환 // 찾는 값이 없으면 -1 반환
		System.out.println(a1.indexOf("a")); 

//		contains(value) : value가 포함되었는지 반환
		System.out.println(a1.contains('여'));
		
//		clear() : 리스트 비우기
//		a1.clear();
//		a1.get(0); --> 0인덱스가 없기 때문에 예외발생
		
		for(Object obj : a1) {
			if(obj instanceof String) {
				System.out.println((String)obj); //string 타입만 뽑아내기 (값 추가시 Object 타입으로 변환되어서 들어가기 때문에)
			}
		}
	}

}
