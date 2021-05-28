package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class Run /*extends Object 생략되어있음*/{

	//모든 클래스는 Object의 후손이다. 즉 , 최상위 클래스는 Object이다.
	//Object에 있는 method는 모두 재정의가 가능하다.
	public static void main(String[] args) {
		
		Book bk1 = new Book("언어의 온도","이기주",20000);
		Book bk2 = new Book("나무","베르나르베르베르",23000);
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		
		System.out.println(bk1.toString()); //bk1.toString() == bk1  =-> 출력문에 어떤 레퍼런스를 출력하고자할 때 JVM이 자동으로 해당 래퍼런스toString()을 호출해준다.
		System.out.println(bk1);  //따라서 위와 결과가 같다. 결과 : com.kh.chap03_override.model.vo.Book@15db9742

		// 1.toString()
		//오버라이딩 전 : Object 클래스의 toString()이 실행 --> 풀패키지명 @해쉬코드 16진수 값이 리턴됨
		//오버라이딩 후 : Book클래스에 있는 toString()이 실행 --> 개발자가 재정의 한대로 해당 객체가 가지고 있는 필드값에 대한 정보를 리턴한다.
		//toString에 information에 있는 정보를 넣어서 사용할 예정
		
		//------------------equals(), hashCode()---------------------
		// 2. equals()
		// 오버라이딩 전 : Object 클래스의 equals 메소드가 실행 --> 두 주소값을 비교
		// 오버라이딩 후 : 두 객체의 주소값 비교가 아닌, 실제 필드 값들을 비교하도록 재정의 + 만약 필드값이 같다면, 주소 값도 같도록 바꿀것
		Book bk3 = new Book("언어의 온도","이기주",20000); //bk1 과 동일한 필드값을 가진 bk3객체 생성
		System.out.println("bk1과 bk3가 같은책인가요?"+(bk1==bk3));      	//false
		System.out.println("bk1과 bk3가 같은책인가요?"+(bk1.equals(bk3))); //false -> 둘다 다른 책이라고 인식되어있다.(주소값은 다르기때문에) --> 오버라이딩 후에는 true 반환
		
		// 동등 객체 : 실제 필드값은 같지만, 해쉬코드가 다른경우
		// 동일 객체 : 실제 필드값도 같고, 해쉬코드 값도 같은경우
		
		
		// 3. hashCode()
		// 오버라이딩 전 : Object 클래스의 hashCode() 메소드가 실행 --> 해당 객체의 실제 주소값을 10진수로 계산한 결과
		// 오버라이딩 후 : 두 객체의 실제 주소값을 가지고 작업 하지 않고, 두 객체의 실제 멤버 값들이 같은 경우 같은 해시코드값이 나오도록 재정의
		System.out.println("bk1의 해쉬코드 : "+bk1.hashCode());
		System.out.println("bk2의 해쉬코드 : "+bk2.hashCode());
		System.out.println("bk3의 해쉬코드 : "+bk3.hashCode()); // 오버라이딩 후에는 hashCode 같아짐
		
		
	}

}
