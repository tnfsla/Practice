package com.kh.chap03_override.model.vo;

import java.util.Objects;

public class Book {
	private String title;
	private String author;
	private int price;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String information() {
		return "title : " + title + ", author : " + author + ", price : " + price;
	}

	// 1. Object 클래스의 toString() 메소드를 오버라이딩해서 가져오기
	public String toString() {
		// TODO Auto-generated method stub
		return "toString() --> title : " + title + ", author : " + author + ", price : " + price;
	}

	// 2. equals 메소드의 내용을 주소값 비교가 아닌 실제 필드값들이 모두 같을경우 true 반환되고 하나라도 틀릴경우 false가 되도록 재정의
	@Override
	public boolean equals(Object obj) {
		// 		bk1.equals(bk2)
		//		this(현재객체)		vs 		전달받은 비교대상(obj)
		//  	자료형 : Book				자료형 :Object
		if(!(obj instanceof Book)) //혹시라도 이 obj가 Book 개체가 아니라면 비교할 수 없으니!
			return false;
		
		Book other = (Book)obj; // 비교하기위해서 obj 타입을 강제형변환 ==> 상속구조에서는 클래스로 형변환이 가능하다.
		// 		bk1.equals(bk2)
		//		this(현재객체)		vs 		전달받은 비교대상(obj)
		//  	자료형 : Book				자료형 : Book
		
		if(this.title.equals(other.title) && this.author.equals(other.author)&&this.price == other.price) {
			return true;
		}else {
			return false;
		}

		
	}

	//3. 해시코드
	@Override
	public int hashCode() {
		// 1번 : 해당 객체의 필드값을 하나의 문자열로 합쳐서 그 해당 문자열의 해쉬코드 리턴
		// title + author + price --> 문자열이 된다.
		// 즉, 같은 문자열일 경우 해당 문자열의 hashCode는 같도록 String에서 이미 재정의
//		return (title + author + price).hashCode();  저거 세개를 합친것의 해쉬코드리턴 해주는 것
		
		//2번
		return Objects.hash(title,author,price);
		//Objects.hash는 주어진 값들을 이용해서 코드를 생성하는 역할(따로 저것들을 합친 해쉬코드를 생성해서 리턴한다.)
		//주어진 매개값들로 배열을 생성하고, arrays.hashcode(Object[])를 호출해서 해쉬코드를 얻고 이 값을 리턴해줌
	}

}

// 오버라이딩
// - 자식클래스가 상속받은 부모 클래스의 메소드를 재정의(재작성) 하는 것
// - 부모가 제공하는 메소드를 자식이 일부 고쳐서 사용하겠다는 의미를 자식 객체를 통해 실행시 자식 메소드가 우선권을 가진다

// 오버라이딩 성립조건
// - 부모클래스의 메소드와 메소드 명 동일
// - 매개변수 갯수, 자료형, 순서동일
// - 반환형 동일
// - 부모 메소드의 접근 제한자보다 범위가 같거나 커야한다.
// ex) 부모메소드의 접근 제한자가  protected 일 경우에 오버라이딩 하는 메소드의 접근 제한자는 protexted, public

// @Override (annotation)
// - 명시를 안해줘도 크게 상관이 없다 (명시를 안해줘도 오버라이딩 된 상태)
// - 붙이는 이유 : 찾아보기 쉽다. (오버라이딩 된 메소드임을 표시)

