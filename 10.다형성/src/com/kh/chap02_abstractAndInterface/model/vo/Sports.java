package com.kh.chap02_abstractAndInterface.model.vo;

public abstract class Sports {
	private int people; //참여하는 사람수 (추상클래스는 변수선언이 가능)
	
	public Sports() {
		// TODO Auto-generated constructor stub
	}

	public Sports(int people) {
		super();
		this.people = people;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Sports [People : "+people+" ]";
	}
	
	//추상메소드 정의
	public abstract void rule(); // 추상클래스로 바꿔주어야함 ---> public **abstract** class Sports 변경
	//(미완성된 메소드로 내용이 구현되지 않은 메소드) {} 몸통부가 구현이 되지 않은 상태
	//--> 미완성된 추상 메소드가 있다는 것은 그 메소드를 갖고있는 클래스 또한 미완성클래스  -->추상클래스로 명시를 해주어야한다.
	

}
