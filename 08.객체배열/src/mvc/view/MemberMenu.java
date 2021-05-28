package mvc.view;

import java.util.Scanner;

import mvc.controller.MemberController;
import mvc.model.vo.Member;

public class MemberMenu {
	private MemberController mc = new MemberController();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		while (true) {
			System.out.println("===========회원 관리 메뉴==========");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("6. 회원 정보 정렬");
			System.out.println("9. 프로그램 종료");

			int num = sc.nextInt();
			switch (num) {
			case 1:
				insertMember();
				break;
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAllMember();
				break;
			case 6:
				sortMember();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 메뉴에 있는 번호를 입력해주세요.");
				break;
			}
		}
	}

	private void sortMember() {
		Member[] sortMem = null; // 정렬 결과를 받아 줄 객체배열 초기화

		while (true) {
			System.out.println("============회원 정보 정렬============");
			System.out.println("1. 아이디 오름차순 정렬");
			System.out.println("2. 아이디 내림차순 정렬");
			System.out.println("3. 나이 오름차순 정렬");
			System.out.println("4. 나이 내림차순 정렬");
			System.out.println("5. 성별 내림차순 정렬(남녀순)");
			System.out.println("9. 이전메뉴로");
			System.out.println("메뉴 선택 : ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				sortMem = mc.sortIdAsc();
				for (int i = 0; i < mc.getMemberCount(); i++) {
					if (sortMem[i] != null) {
						System.out.println(sortMem[i].information());
					}
				}
				break;
			case 2:
				sortMem = mc.sortIdDesc();
				for (int i = 0; i < mc.getMemberCount(); i++) {
					if (sortMem[i] != null) {
						System.out.println(sortMem[i].information());
					}
				}
				break;
			case 3:
				sortMem = mc.sortAgeAsc();
				for (int i = 0; i < mc.getMemberCount(); i++) {
					if (sortMem[i] != null) {
						System.out.println(sortMem[i].information());
					}
				}
				break;
			case 4:
				sortMem = mc.sortAgeDesc();
				for (int i = 0; i < mc.getMemberCount(); i++) {
					if (sortMem[i] != null) {
						System.out.println(sortMem[i].information());
					}
				}
				break;
			case 5:
				sortMem = mc.sortGenderDesc();
				for (int i = 0; i < mc.getMemberCount(); i++) {
					if (sortMem[i] != null) {
						System.out.println(sortMem[i].information());
					}
				}
				break;
			case 9:
				return;
			default:
				System.out.println("다시 입력해주세요.");
				break;
			}
		}
	}

	private void printAllMember() {
		Member[] mem = mc.getMem();
		for (int i = 0; i < mc.getMemberCount(); i++) {
			System.out.println(mem[i].information());
		}

	}

	private void deleteMember() {
		System.out.println("삭제할 회원 아이디 : ");
		sc.nextLine();
		String userId = sc.nextLine();
		Member m = mc.checkId(userId);
		if (m != null) {
			System.out.println(m.information());
			System.out.println("정말 삭제하시겠습니까? (y/n) : ");
			char ch = sc.nextLine().charAt(0);
			if (ch == 'Y' || ch == 'y') {
				mc.deleteMember(userId);
				System.out.println("회원 정보가 삭제되었습니다.");
			} else {
				System.out.println("삭제하지 않습니다. 초기화면으로 돌아갑니다.");
			}
		} else {
			System.out.println("삭제할 회원이 존재하지 않습니다.");
		}

	}

	private void updateMember() {
		while (true) {
			System.out.println("======회원 정보 수정=========");
			System.out.println("1. 비밀번호 수정");
			System.out.println("2. 이름 수정");
			System.out.println("3. 이메일 수정");
			System.out.println("9. 이전 메뉴로");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
			case 2:
			case 3:
				System.out.println("변경할 회원 아이디 : ");
				sc.nextLine();
				String userId = sc.nextLine();
				if (mc.checkId(userId) != null) {
					Member m = mc.checkId(userId);
					System.out.println(m.information());
					System.out.println("무엇으로 변경합니까? : ");
					String update = sc.nextLine();
					mc.updateMember(m, menu, update);
					System.out.println("회원 정보가 변경되었습니다.");
				} else {
					System.out.println("변경할 회원이 존재하지 않습니다.");
				}
				break;
			case 9:
				return;
			default:
				System.out.println("다시 입력해주세요.");
				break;
			}
		}
	}

	private void searchMember() {
		while (true) {
			System.out.println("=============회원 정보 검색============");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 이전메뉴로");
			System.out.println("메뉴선택 : ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
			case 2:
			case 3:
				System.out.println("검색 내용 : ");
				sc.nextLine();
				String search = sc.nextLine();
				if (mc.searchMember(menu, search) != null) {
					System.out.println(mc.searchMember(menu, search).information());
				} else {
					System.out.println("검색된 결과가 없습니다.");
				}
			case 9:
				return;
			default:
				System.out.println("다시 입력해주세요.");
				break;
			}

		}

	}

	private void insertMember() {
		if (mc.getMemberCount() >= mc.SIZE) {
			return;
		} else {
			System.out.println("사용할 아이디 입력 : ");
			sc.nextLine();
			String userId = sc.nextLine();

			if (mc.checkId(userId) != null) {
				System.out.println("동일한 아이디가 존재합니다. 회원 등록 실패");
			} else {
				System.out.println("비밀번호 입력 : ");
				String userPwd = sc.nextLine();
				System.out.println("이름 입력 : ");
				String name = sc.nextLine();
				System.out.println("나이 입력 : ");
				int age = sc.nextInt();
				System.out.println("성별 입력 : ");
				sc.nextLine();
				char gender = sc.nextLine().charAt(0);
				System.out.println("이메일 입력 : ");
				String email = sc.nextLine();

				Member m = new Member(userId, userPwd, name, age, gender, email);
				mc.insertMember(m);
				System.out.println("성공적으로 회원 등록이 되었습니다.");
			}

		}

	}

}
