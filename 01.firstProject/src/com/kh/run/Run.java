package com.kh.run;

import com.kh.first.A_MethodPrinter;
import com.kh.first.B_ValuePrinter;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_MethodPrinter AM = new A_MethodPrinter(); //ctrl + space로 자동완성까지 쳐직쳐직
		B_ValuePrinter BM = new B_ValuePrinter();
		//  import 없이 사용하려면 com.kh.first.A_MethodPrinter a = new com.kh.first.A_MethodPrinter();  도 가능하다.

		// *****************************  ctrl + shift + O 자동 import            ************************
		BM.printValue();

		
	}

}
