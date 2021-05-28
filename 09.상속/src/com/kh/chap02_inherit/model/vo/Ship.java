package com.kh.chap02_inherit.model.vo;

public class Ship extends Vehicle {
	private int propeller;
	
	public Ship() {
		// TODO Auto-generated constructor stub
	}

	public Ship(String name, double mileage, String kind, int propeller) {
		super(name, mileage, kind);
		this.propeller = propeller;
		// TODO Auto-generated constructor stub
	}

	public int getPropeller() {
		return propeller;
	}

	public void setPropeller(int propeller) {
		this.propeller = propeller;
	}

	@Override
	public String information() {
		// TODO Auto-generated method stub
		return "Ship [ "+super.information()+", propeller : "+propeller+" ]";
	}

	@Override
	public void howToMove() {
		// TODO Auto-generated method stub
		System.out.println("프로펠러를 돌려서 이동한다.");
	}
	
	
	

}
