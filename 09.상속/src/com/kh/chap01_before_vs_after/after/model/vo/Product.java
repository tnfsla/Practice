package com.kh.chap01_before_vs_after.after.model.vo;

public class Product {
	private String brand; // 브랜드
	protected String pCode; // 상품번호
	private String pName; // 상품이름
	private int price; // 가격
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String brand, String pCode, String pName, int price) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String information() {
		return "brand : "+brand+", pCode : "+pCode + ", pName : "+pName + ", price : "+price;
		
	}
	public void print() {
		System.out.println("나 product");
	}
}
