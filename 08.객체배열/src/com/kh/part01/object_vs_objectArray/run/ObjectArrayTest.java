package com.kh.part01.object_vs_objectArray.run;

import java.util.Scanner;

import com.kh.part01.object_vs_objectArray.model.vo.Book;

public class ObjectArrayTest {

	public static void main(String[] args) {
		// 1. 기본 자료형 배열
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;

		System.out.println(arr);
		System.out.println(arr[0]);

		// arr의 자료형 : int[] --> 레퍼런스 변수 == 주소값을 가지는 변수
		// arr[index]의 자료형 : int --> 일반변수처럼 실제값을 가지고 있음

		// 2. 객체들을 여러개 담을때 객체 배열을 사용
		Book[] books = new Book[3];
		// books 의 자료형 : Book[] --> 레퍼런스 변수 == 주소값을 가지는 변수
		// books[index]의 자료형 : Book --> 일반 변수 == 실제값을 가지는 변수
		// books[index] = 객체생성
	

		System.out.println(books);
		System.out.println(books[0].getPrice()); // books[0].getPrice()의 자료형 : int --> 실제값 여기에 존재
		System.out.println(books[1]); // books[1] --> 주소값만 존재

//		Scanner sc = new Scanner(System.in);

//		for (int i = 0; i < books.length; i++) {
//			System.out.println((i + 1) + "번째 도서 정보 입력");
//			System.out.println("제목 : ");
//			String title = sc.nextLine();
//
//			System.out.println("저자 : ");
//			String author = sc.nextLine();
//
//			System.out.println("가격 : ");
//			int price = sc.nextInt();
//			sc.nextLine();
//
//			System.out.println("출판사 ; ");
//			String publisher = sc.nextLine();
//			
//			books[i] = new Book(title, author, price, publisher); //해당 인덱스로 사용자가 입력한 값을 가지고 객체를 생성하여 조건처리할 필요가 없어졌다.
//
//			
//		}
		
//		for(int i = 0; i<books.length; i++) {
//			System.out.println(books[i].information());
//		}
//		
//		System.out.println("도서 제목을 검색해서 정보를 출력합니다.");
//		String search = sc.nextLine();
//		for(int i = 0; i<books.length; i++) {
//			search(search,books[i]);
//		}
//		String search = sc.nextLine();
//		if(search.equals(bk1.getTitle())){
//			System.out.println(bk1.information());
//		}else if(search.equals(bk2.getTitle())){
//			System.out.println(bk2.information());
//		}else if(search.equals(bk3.getTitle())){
//			System.out.println(bk3.information());
//		}else{
//		System.out.println("일치하는 도서가 없습니다);
//	 	}  ->> 객체 배열을 사용하면 이따위로 안하고 index, for문 이용하면 너무ez

		for(int num : arr) {
			System.out.println("num : "+num);
			//arr의 배열만큼 반복하면서 반복문이 실행 될때마다 0번째인덱스부터 마지막 인덱스까지 값이 num에 담긴다.
		}
		
//		for(Book b : books) {
//			System.out.println("b : "+b.information());
//			
//		}
		
	}
//	private static void search(String search, Book bk) {
//		if (search.equals(bk.getTitle())) {
//			System.out.println(bk.information());
//		}
//	}
	
	
	

}
