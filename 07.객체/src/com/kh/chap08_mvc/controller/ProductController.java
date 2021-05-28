package com.kh.chap08_mvc.controller;

import com.kh.chap08_mvc.model.vo.Product;

// Controller : 사용자요청에 의해서 서비스 호출 전 파라미터 셋팅(서비스 단을 생략해서, 현재는 비지니스 로직(데이터 수정, 가공, 처리)만 넣을 예정)
public class ProductController {

	
	private Product pro = null;
	
//	먼저 선언해두고 빨간줄에 생성누르면 자동생성
	public void insertProduct(String name, String brand, int price) {
		pro = new Product(name, brand, price);
		
	}

	public Product selectProduct() {
		// TODO Auto-generated method stub 
		return pro;
	}

	public void updatePrice(int nPrice) {
		// TODO Auto-generated method stub
		pro.setPrice(nPrice);
	}

}
