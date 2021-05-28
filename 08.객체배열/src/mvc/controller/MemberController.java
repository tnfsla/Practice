package mvc.controller;

import mvc.model.vo.Member;

public class MemberController {
	public final int SIZE = 10;
	private int memberCount;
	private Member[] mem = new Member[SIZE];

	{
		mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
		memberCount = 5;
	}

	public int getMemberCount() {
		// TODO Auto-generated method stub
		return memberCount;
	}

	public Member[] getMem() {
		return mem;
	}

	public Member checkId(String userId) {
		Member m = null;

		for (Member a : mem) {
			if (a != null) {
				if (a.getUserId().equals(userId)) {
					m = a;
				}
			}
		}
		return m;

	}

	public void insertMember(Member m) {
		mem[memberCount++] = m;
	}

	public Member searchMember(int menu, String search) {
		Member searchMember = null;
		if (menu == 1) {
			for (int i = 0; i < memberCount; i++) {
				if (mem[i].getUserId().equals(search)) {
					searchMember = mem[i];
				}
			}
		} else if (menu == 2) {
			for (int i = 0; i < memberCount; i++) {
				if (mem[i].getName().equals(search)) {
					searchMember = mem[i];
				}
			}
		} else {
			for (int i = 0; i < memberCount; i++) {
				if (mem[i].getEmail().equals(search)) {
					searchMember = mem[i];
				}
			}
		}

		return searchMember;

	}

	public void updateMember(Member m, int menu, String update) {
		if (menu == 1) {
			m.setUserPwd(update);
		} else if (menu == 2) {
			m.setName(update);

		} else {
			m.setEmail(update);

		}

	}
	
	public void deleteMember(String userId) {
		Member m = checkId(userId);
		int deleteCount = 0;
		for (int i = 0; i < memberCount - 1; i++) {
			if (!userId.equals(mem[i].getUserId())) {
				deleteCount++;
			} else {
				break;
			}
		}
		for (int i = deleteCount; i < memberCount - 1; i++) {
			mem[i] = mem[i + 1];
		}

		memberCount--;

		// 매개변수로 전달받은 userId가 mem에 존재하는 경우 해당 회원 삭제 후
		// 다음 인덱스 객체들의 정보를 한 칸씩 앞으로 이동 시킴
		// 실행 시 NullPointerException 발생할 수 있음 -> 왜 그런지 생각해보고 해결하시오
		// memberCount 1 감소
	}

	public Member[] sortIdAsc() {
		// 기존의 회원 객체 배열(mem)을 변경하지 않고 단지 정렬된 결과만을 보여주기 위해
		// 기존의 배열 복사해서 사용 (clone(), System.arraycopy() 둘 중 하나 사용해서 복사)

		Member[] copy = mem.clone();
		Member temp = null;
		for (int i = 0; i < memberCount; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i] != null) {
					if (copy[i].getUserId().compareTo(copy[j].getUserId()) < 0) {
						temp = copy[i];
						copy[i] = copy[j];
						copy[j] = temp;
					}
				}
			}
		}
		return copy;
		// copy 배열을 아이디 별 오름차순 정렬 진행
		// --> HINT : String 클래스의 compareTo() 메소드 활용
		// copy 주소 값 리턴

	}

	public Member[] sortIdDesc() {
		Member[] copy = mem.clone();
		Member temp = null;
		for (int i = 0; i < memberCount; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i] != null) {
					if (copy[i].getUserId().compareTo(copy[j].getUserId()) > 0) {
						temp = copy[i];
						copy[i] = copy[j];
						copy[j] = temp;
					}
				}
			}
		}
		return copy;
	}

	public Member[] sortAgeAsc() {
		Member[] copy = mem.clone();
		Member temp = null;
		for (int i = 0; i < memberCount; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i] != null) {
					if (copy[i].getAge() < copy[j].getAge()) {
						temp = copy[i];
						copy[i] = copy[j];
						copy[j] = temp;
						
					}
				}
			}
		}
		
		return copy;
	}

	public Member[] sortAgeDesc() {
		Member[] copy = mem.clone();
		Member temp = null;
		for (int i = 0; i < memberCount; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i] != null) {
					if (copy[i].getAge() > copy[j].getAge()) {
						temp = copy[i];
						copy[i] = copy[j];
						copy[j] = temp;
					}
				}
			}
		}
		return copy;
	}

	public Member[] sortGenderDesc() {
		Member[] copy = mem.clone();
		Member temp = null;
		for (int i = 0; i < memberCount; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i] != null) {
					if (copy[i].getGender() > copy[j].getGender()) {
						temp = copy[i];
						copy[i] = copy[j];
						copy[j] = temp;
					}
				}
			}

		}
		return copy;
	}

}
