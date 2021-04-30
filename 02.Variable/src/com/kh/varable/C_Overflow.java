package com.kh.varable;

public class C_Overflow {
	
	public void printVariableSize() {
		System.out.println("byte : "+Byte.BYTES+"byte"+Byte.SIZE);
		System.out.println("short : "+Short.BYTES +"   "+Short.SIZE  );
		System.out.println("int : "+Integer.BYTES );
		System.out.println("long : " +Long.BYTES );
		System.out.println("float : "+Float.BYTES );
		System.out.println("double : "+Double.BYTES );
		System.out.println("char : "+Character.BYTES );
		
	}
	
	public void overFlow() {
		byte bNum = 127;
		System.out.println(bNum);
		
		byte result = (byte)(bNum+3);
		
		System.out.println("result : "+result);
		
		int num1 = 1000000;
		long num2 = 700000; //굳이 L안붙여도 되긴하고, 이상태로 곱해도 결과가 long형이기만 하면 ㄱㄴ
		
		long result2 = num1 * num2; 	//곱셈 자체의 결과가 int형이기 때문에 이미 오버플로우가 발생함. 
											//따라서 둘중 하나라도 먼저 long형으로 형변환 해야함.
		System.out.println(result2);
	}

}
