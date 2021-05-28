package com.kh.chap02_inherit.model.vo;

public class Airplane extends Vehicle{
	private int tire;
	private int wings;
	
	public Airplane() {
		// TODO Auto-generated constructor stub
	}

	public Airplane(String name, double mileage, String kind, int tire, int wings) {
		super(name, mileage, kind);
		// TODO Auto-generated constructor stub
		this.tire = tire;
		this.wings = wings;
	}
	
	public double Ariplane() {
		return 1.5;
	}
	
	
	public int Airplane() {
		return 0;
	}
	

	public void setTire(int tire) {
		this.tire = tire;
	}

	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}

	@Override
	public String information() {
		// TODO Auto-generated method stub
		return "Airplane [ "+super.information()+", tire : "+tire+", wings : "+wings+" ]";
	}

	@Override
	public void howToMove() {
		// TODO Auto-generated method stub
		System.out.println("날개를 가지고 날아다닌다.");
	}

	

}
