package com.kh.chap03_class.model.vo;

public class Product {
	private String name;
	private int price;
	private String brand;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String information() {
		return name+"   "+price+"   "+brand;
	}
}

class DftProduct{ //default 접근제한자 사용
	private String dName;
	public void setDname(String dName) {
		this.dName = dName;
	}
	
}
