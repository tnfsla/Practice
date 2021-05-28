package com.kh.part01.object_vs_objectArray.run;

import java.util.Scanner;

import com.kh.part01.object_vs_objectArray.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "번째 도서 정보 입력");
			System.out.println("제목 : ");
			String title = sc.nextLine();

			System.out.println("저자 : ");
			String author = sc.nextLine();

			System.out.println("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();

			System.out.println("출판사 ; ");
			String publisher = sc.nextLine();

			if (i == 0) {
				bk1 = new Book(title, author, price, publisher);
			} else if (i == 1) {
				bk2 = new Book(title, author, price, publisher);
			} else {
				bk3 = new Book(title, author, price, publisher);
			}

		} // 객체 생성 끝

		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());

		// 도서제목 검색
		System.out.println("도서 제목을 검색해서 정보를 출력합니다.");
		String search = sc.nextLine();
		search(search, bk1);
		search(search, bk2);
		search(search, bk3);
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

	}

	private static void search(String search, Book bk) {
		if (search.equals(bk.getTitle())) {
			System.out.println(bk.information());
		}
	}

}
