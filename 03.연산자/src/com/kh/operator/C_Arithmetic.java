package com.kh.operator;

public class C_Arithmetic {

	public void method1() {
	int num1 = 10;
	int num2 = 3;
	System.out.println("num1 + num2 = "+(num1+num2));
	System.out.println("num1 - num2 = "+(num1-num2));
	System.out.println("num1 * num2 = "+(num1*num2));
	System.out.println("num1 / num2 = "+(num1/num2));
	System.out.println("num1 % num2 = "+(num1%num2));
	
	}
	
	public void method2() {
		int a = 35;
		int b = 10;
		
		double sum = a+b;
		double sub = a-b;
		double mul = a*b;
		double div = a/b;
		double mod = a%b;
		
	}
	
	public void method3() {
		int a=5;       		//a=5
		int b=10;			//b=10;
		int c=(++a)+b;		//a=6,b=10,c=16
		int d= c/a;			//d=2
		int e = c%a;		//e=4
		int f = e++;		//f=4, e=4(5)
		int g = (--b)+(d--);//g=11, b=9, d=2(1)
		int h = 2;			//h=2
		int i = a++ +b/(--c/f)*(g-- - d)%(++e + h); 	//a=6(7), c=15, g=11(10), e=6, i=12
		// 6+9/(15/4)*(11-1)%(6+2)=
		//15/4 = 3으로 처리
		//6+9/3*10%8=12
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		System.out.println("d : "+d);
		System.out.println("e : "+e);
		System.out.println("f : "+f);
		System.out.println("g : "+g);
		System.out.println("h : "+h);
		System.out.println("i : "+i);
		
	}
}
