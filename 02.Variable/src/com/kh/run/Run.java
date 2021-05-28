package com.kh.run;

import com.kh.varable.A_Variable;
import com.kh.varable.B_Constant;
import com.kh.varable.C_Overflow;
import com.kh.varable.D_Cast;
import com.kh.varable.E_Printf;
import com.kh.varable.F_KeyboardInput;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A_Variable a = new A_Variable();
		B_Constant b= new B_Constant();
		C_Overflow c = new C_Overflow()	;
		D_Cast d = new D_Cast();
		E_Printf e = new E_Printf();
		F_KeyboardInput f = new F_KeyboardInput();
		
		//a.printValue();
		//a.declareVariable();
		//a.initVariable();
		//a.test();
//		b.finalConstant();

		//c.overFlow();
		//e.printMethod();
		f.inputScanner3();
	}
	
	

}
