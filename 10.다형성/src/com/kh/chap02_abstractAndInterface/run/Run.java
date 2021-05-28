package com.kh.chap02_abstractAndInterface.run;

import com.kh.chap02_abstractAndInterface.model.vo.BasketBall;
import com.kh.chap02_abstractAndInterface.model.vo.FootBall;
import com.kh.chap02_abstractAndInterface.model.vo.Sports;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 추상클래스
		// - 미완성 클래스
		// - 추상메소드를 포함한 클래스 (즉, 일반필드 + 일반메소드 + [추상메소드])
		// --> 추상메소드를 가진 클래스는 반드시 추상클래스로 명시해야됨
		
		// - +일반적인 멤버(변수, 메소드)도 포함 가능
		// - 미완성된 클래스이기 때문에  new 라는 연산자를 통해 생성 불가능
		// --> 단 레퍼런스 (참조형 변수의 타입)로는 사용가능
		// --> 상속 관계로 구현되어 있을 테니 부모 레퍼런스로 자식 객체 참조 가능 (다형성 적용)
		
		// 추상메소드
		// - 미완성된 메소드로 몸통부({})가 구현되어 있지 않는 메소드
		// - 추상클래스를 상속 받은 자식 클래스에서 반드시 오버라이딩 해야됨
		// --> 오버라이딩 해주지 않으면 에러 발생
		// --> 메소드 사용의 통일성 확보 목적
		// --> 표준화 된 틀을 제공 할 목적으로 사용
		
		//Sports s1 = new Sports();  객체생성 불가능 (추상메소드를 갖고있기때문에)
		Sports s ; // 레퍼런스로는 사용 가능함(다형성 적용해서 자식 개체 생성하여 받아주기는 가능함)
		s = new FootBall(); //Sports를 상속받는 football은 가능
		Sports[] arr = new Sports[2];
		arr[0] = new BasketBall();
		arr[1] = new FootBall();
		
		for(int i =0 ; i<arr.length ; i++) {
			arr[i].rule();
		}
		
		for(Sports aa : arr) {
			aa.rule();
		}
		

	}

}
