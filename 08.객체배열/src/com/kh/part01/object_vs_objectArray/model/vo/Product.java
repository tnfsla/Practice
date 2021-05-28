package com.kh.part01.object_vs_objectArray.model.vo;

public class Product {
	private String name;
	private String brand;
	private int price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, String brand, int price) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String information() {
		return "name : "+name+"\nbrand : "+brand+"\nprice : "+price;
	}
	

}
