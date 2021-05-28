package com.kh.chap04_wrapper.controller;

public class A_WrapperTest {
	// Wrapper 클래스
		// --> 기본자료형을 객체로 포장해주는 클래스가 래퍼 클래스(Wrapper 클래스)이다.
		
		// - 기본 자료형으로 사용을 해도되지만 프로그램에 따라서 해당 기본 타입을 객체로 취급해야 되는 경우가있다.
		// ex) 메소드의 매개변수로 객체 타입만이 요구될 때
		//     다형성을 적용하고 싶을 때
		//     Object에 있는 메소드를 사용하고 싶을 때

		//		위와 같은 경우 기본자료형의 데이터로는 그대로 사용할 수 없기 때문에 객체로 변환한 후에 작업을 수행해야한다.

		//	기본자료형		  Wrapper클래스
		//	boolean  <-->	Boolean
		//	char	 <-->	Character
		//	short	 <-->	Short
		//	byte	 <-->	Byte
		// 	int		 <-->	Integer
		//	long	 <-->	Long
		//	float	 <-->	Float
		//	double	 <-->	Double
	
	public void method1() {
//		Boxing : 기본자료형 --> Wrapper클래스 자료형으로 바꾸는 방법
		int num1 = 10;
		int num2 = 15;
		
		//1.객체 생성을 통해 하는 방법
		Integer i1 = new Integer(num1);
		Integer i2 = new Integer(num2);
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println(i1==i2);  // num1과 num2가 같은 10을 가졌다고 할때, false가 나옴.
		//객체로 생성했기때문에 Integer 메소드 사용가능
		System.out.println(i1.equals(i2)); //num1과 num2가 같은 10을 가졌다고 할때, true 나옴
		System.out.println(i1.compareTo(i2)); //앞쪽이 크면 1, 뒤에가 크면 -1, 같으면 0 반환
		
		
//		객체를 생성하지 않고 바로 대입하는 방법(AutoBoxing)
//		Integer i5 = "123";  --> 불가능 (타입이 다름)
		Integer i3 = 123; // --> 가능 (같은 타입이니까)
		Integer i4 = new Integer("123"); // 객체생성을 통해서 Boxing 하게되면 문자열도 가능하다 --> BUT 문자열이 같은 변수형이 아니면 ****불가능****
		System.out.println(i4);
		
		//UnBoxing : Wrapper클래스 --> 기본자료형으로 바꾸는 방법
		
//		1. Wrapper 클래스의 xxxValue() 를 통해 변환
		int num3 = i1.intValue();
		int num4 = i2.intValue();
		System.out.println(num3+num4);
				
//		2. 메소드를 사용하지 않고 바로 변환(AutoUnBoxing)
		int num5 = /*(int)*/i1;     //(int)생략과 같음
		System.out.println(num5);
		
		
		//Integer i2 = new Integer(10);      --> i2는 Integer 타입 --> 모두다 가능하다.(int 형이든 Object 형이든 Integer 형이든)
		
		// 다형성 적용--> 자동으로 처리해줌(auto, upcasting)
		test(i2);	//Integer 형으로 받기
		test1(i2);	//Object 형으로 받기
		test2(i2);	//int 형으로 받기
		
		
	}

	private void test2(int num) {
		// TODO Auto-generated method stub
		System.out.println(num);
	}

	private void test1(Object num) {
		// TODO Auto-generated method stub
		System.out.println(num);
	}

	private void test(Integer num) {
		// TODO Auto-generated method stub
		System.out.println(num);
	}

}
