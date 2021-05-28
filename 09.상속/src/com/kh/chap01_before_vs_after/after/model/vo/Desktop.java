package com.kh.chap01_before_vs_after.after.model.vo;

public class Desktop extends Product {
	private boolean allInOne;
	
	public Desktop() {
		// TODO Auto-generated constructor stub
	}

	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		super(brand, pCode, pName, price); //부모호출 (super()생성자는 자식 생성자에서 부모 생성자 호출 + 생성자로 접근시에는 반드시 첫줄에 작성
		
		//super.pCode = pCode; // 이렇게 쓰려면 부모필드의 접속 제어자가 private가 아닌 protected로 선언되어야한다. (접근하고자 하는 필드가 private이면 불가능함)
		//super. 의 super는 해당 객체의 부모주소를 담고있다. 따라서 super. 으로 접근이 가능하다.
		
		this.allInOne = allInOne; //-> 추가해줘야 함  매개변수측의 boolean allInOne도 추가해줘야함 alt+shift+s 의 맨 아래쪽 걸 상속때 사용하면 되는듯
		// TODO Auto-generated constructor stub
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	
	public String information() {
		return super.information()+", allInOne : "+allInOne;
	}
	
//	public void print() {
//		System.out.println("나 desktop");
//	}

	

}
