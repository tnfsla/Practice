package com.kh.part02.personMVC.view;

import java.util.Scanner;

import com.kh.part02.personMVC.controller.PersonController;
import com.kh.part02.personMVC.model.vo.Person;

public class PersonMenu {

	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();

	public void mainMenu() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("===========메뉴==========");
			System.out.println("1. 회원 추가");
			System.out.println("2. 회원 전체 조회");
			System.out.println("3. 회원 이름 검색");
			System.out.println("4. 회원 평균 재산 조회");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				insertPerson();
				break;
			case 2:
				printPerson();
				break;
			case 3:
				searchPerson();
				break;
			case 4:
				System.out.println("평균 재산 : "+pc.avgWealth());
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("일치하는 메뉴가 없으니 다시 입력하세요");
				break;
			}
		}

	}

	private void searchPerson() {
		// TODO Auto-generated method stub
		System.out.println("========회원 이름 검색==========");
		int cnt = pc.getCount();
		if (cnt == 0) {
			System.out.println("추가된 회원이 없습니다.");
			return;
		} else {
			System.out.println("찾는 회원의 이름을 입력하세요");
			String search = sc.nextLine();
			Person peo = pc.searchPerson(search);
			if (peo == null) {
				System.out.println("찾으시는 회원은 등록되어있지 않습니다.");
			} else {
				System.out.println(peo.information());
			}

		}

	}

	private void printPerson() {
		System.out.println("==========회원 정보 조회==========");
		int cnt = pc.getCount();
		if (cnt == 0) {
			System.out.println("추가된 회원이 없습니다.");
			return;
		} else {
			Person[] peo = pc.getPeople();

//			for (int i = 0; i < cnt; i++) {
//				System.out.println(peo[i].information());
//			}

			for(Person p : peo) {
				if( p!= null)
				System.out.println(p.information());
//				if(!p.getName().equals(null))
//					System.out.println(p.information());  -==> 내가 생각했던 것  안되는 이유 : p.getName()까지 갈 수가 없다 . 이미 p는 null이니까!
			}
		}

	}

	private void insertPerson() {
		System.out.println("=========회원 정보 입력========");
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("나이 : ");
		int age = sc.nextInt();
		System.out.println("재산 : ");
		int wealth = sc.nextInt();
		sc.nextLine();

		boolean a = pc.insertPerson(name, age, wealth);
		if (!a) {
			System.out.println("3명을 초과하여 저장이 불가합니다.");
		} else {
			System.out.println("성공적으로 저장되었습니다. (" + pc.getCount() + "/3)");
		}

	}

}
