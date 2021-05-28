package com.kh.part01.object_vs_objectArray.run;

import java.util.Scanner;

import com.kh.part01.object_vs_objectArray.model.vo.Product;

public class ObjectArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//제품을 담을 Product 객체 배열 할당 : 3개 제품을 받아올 수 있도록
		Scanner sc = new Scanner(System.in);
		Product[] pd = new Product[3];
		
//		for(int i =0; i<pd.length ; i++) {
//			System.out.println("제품명");
//			String name = sc.nextLine();
//			System.out.println("브랜드");
//			String brand = sc.nextLine();
//			System.out.println("가격");
//			int price = sc.nextInt();
//			sc.nextLine();
//			
//			pd[i] = new Product(name, brand, price); 
//		}
		
		/*
		int i =0;
		
		for(Product p : pd) {
			System.out.println("제품명");
			String name = sc.nextLine();
			System.out.println("브랜드");
			String brand = sc.nextLine();
			System.out.println("가격");
			int price = sc.nextInt();
			sc.nextLine();
			
			pd[i++] = new Product(name, brand, price);
		}
		*/   //향상된 for문을 통해서 입력을 한다면 이렇게 할 수 있겠지만, 출력할때 주로 사용하므로 그냥 일반적인 for문 통해서 입력받자.
		
		
		for(Product p : pd) {
			System.out.println(p.information());
		}

	}

}
