package com.kh.chap01_poly.part02_electronic.model.vo;

public class Tablet extends Electronic{

	private boolean penFlag;
	
	public Tablet() {
		// TODO Auto-generated constructor stub
	}

	public Tablet(String brand, String name, int price, boolean penFlag) {
		super(brand, name, price);
		this.penFlag = penFlag;
		// TODO Auto-generated constructor stub
	}

	public boolean isPenFlag() {
		return penFlag;
	}

	public void setPenFlag(boolean penFlag) {
		this.penFlag = penFlag;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", penFlag : "+penFlag;
	}
	
	

}
