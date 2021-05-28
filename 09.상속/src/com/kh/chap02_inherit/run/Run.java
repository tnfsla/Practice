package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.controller.Controller;
import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;
import com.kh.chap02_inherit.model.vo.Vehicle;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Car c = new Car("벤틀리", 12.5, "sedan", 4);
//		Airplane a = new Airplane("비행기 ", 0.021, "제트기", 16, 5);
//		Ship s = new Ship("낚시배", 3, "어선", 1);
//
//		System.out.println(c.information());
//		System.out.println(a.information());
//		System.out.println(s.information());
//
//		c.howToMove();
//		a.howToMove();
//		s.howToMove();

		Controller vc = new Controller();
		vc.insert(new Car("벤틀리", 12.5, "sedan", 4));
		vc.insert(new Airplane("비행기 ", 0.021, "제트기", 16, 5));
		vc.insert(new Ship("낚시배", 3, "어선", 1));
		
//		System.out.println(vc.select(0).information());
//		System.out.println(vc.select(1).information());
//		System.out.println(vc.select(2).information());
		
		Vehicle[] vl = vc.selectAll();
		
		for(Vehicle v : vl) {
			v.howToMove();
			System.out.println(v.information());
			
		}

		Airplane a = new Airplane();
		int b = a.Airplane();
		
		
		System.out.println(b +" "+a.Ariplane());
	}
	

}
