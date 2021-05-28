package com.kh.chap08_mvc.view;
//mvc 패턴 중 view 패키지 : 사용자가 보게될 화면을 담당하는 부분, 사용자가 보는 (출력부 print구문)부분을 반드시 view 패키지내에서만 작성

import java.util.Scanner;

import com.kh.chap08_mvc.controller.ProductController;

public class ProductMenu {
	private Scanner sc = new Scanner(System.in); // 입력하기위한 scanner객체를 전역변수로 미리 생성해놓는다.
	private ProductController pc = new ProductController(); // 사용자가 키보드로 값을 입력하고 어떤 기능을 요청하는 경우 해당 클래스에서 처리하는 것이 아닌
															// Controller에서 처리한다!

	public void mainMenu() {
		System.out.println("제품명 : ");
		String name = sc.nextLine();

		System.out.println("브랜드명 : ");
		String brand = sc.nextLine();

		System.out.println("가격 : ");
		int price = sc.nextInt();

		pc.insertProduct(name, brand, price);

		while (true) {
			System.out.println("==========메인메뉴========");
			System.out.println("1. 제품 정보 조회");
			System.out.println("2. 제품 정보 수정");
			System.out.println("9. 프로그램 종료");

			int num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				System.out.println(pc.selectProduct().information());
				break;
			case 2:
				updatePrice();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("메뉴를 다시 선택해주세요");
				break;

			}

		}
	}

	private void updatePrice() {
		System.out.println(" 수정할 가격을 입력해주세요 ");
		int nPrice = sc.nextInt();
		pc.updatePrice(nPrice);

	}

}
