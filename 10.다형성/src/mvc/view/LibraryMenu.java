package mvc.view;

import java.util.Scanner;

import mvc.controller.LibraryManager;
import mvc.model.vo.Book;
import mvc.model.vo.Member;

public class LibraryMenu {
	private LibraryManager lm = new LibraryManager();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.println("사용자의 이름은 ? : ");
		String name = sc.nextLine();
		System.out.println("사용자의 나이는 ? : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("사용자의 성별은 ? : ");
		char gender = sc.nextLine().charAt(0);
		
		Member mem = new Member(name,age,gender,0);
		lm.insertMember(mem);
		
		while(true) {
			System.out.println("=======메뉴=======");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("0. 프로그램 종료하기");
			
			System.out.println("메뉴 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			switch(num) {
			case 1:
				System.out.println(lm.myInfo().toString());
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
				break;
			}
		}
		
		
	}
	public void selectAll() {
		Book[] b = lm.selectAll();
		for(int i = 0; i<b.length ; i++) {
			System.out.println(i+"번 도서 : "+b[i].toString());
			
		}
		
	}
	public void searchBook() {
		System.out.println("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		Book[] searchList = lm.searchBook(keyword);
		
		for(Book baa : searchList) {
			if(baa!=null)
			System.out.println(baa.toString());
		}
		
	}
	public void rentBook() {
		selectAll();
		System.out.println("대여할 도서 번호 선택 : ");
		int num = sc.nextInt();
		int result = lm.rentBook(num);
		if(result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		}else if(result == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		}else if(result == 2){
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
		}
		
	}

}
