package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicController2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;


public class Run {
	public static void main(String[] args) {
		//1. 다형성을 적용 안한 경우
		/*
		ElectronicController ec = new ElectronicController();
		ec.insert(new Desktop("삼성", "데스크탑", 10000, "Geforce 1070"));
		ec.insert(new NoteBook("LG","그램",200000,3));
		ec.insert(new Tablet("애플","아이패드",230000,false));
		
		Desktop d = ec.selectDesktop();
		NoteBook n = ec.selectNoteBook();
		Tablet t = ec.selectTablet();
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		*/
		
		//2. 다형성을 적용 한 경우
		ElectronicController2 ec = new ElectronicController2();
		ec.insert(new Desktop("삼성", "데스크탑", 10000, "Geforce 1070"));
		ec.insert(new NoteBook("LG","그램",200000,3));
		ec.insert(new Tablet("애플","아이패드",230000,false));
		
		Electronic d = ec.select(0);
		Electronic n = ec.select(1);
		Electronic t = ec.select(2);
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		
		Electronic[] el = ec.selectAll();

		for(Electronic e : el) {
			if(e instanceof Desktop) {
				((Desktop)e).setGraphic("Geforce 1080");
				System.out.println(((Desktop)e).getGraphic());
			}else if(e instanceof NoteBook) {
				System.out.println(((NoteBook)e).getUsbPort());
			}else {
				System.out.println(((Tablet)e).isPenFlag());
			}
			
			// 위에서 볼 수 있듯, 특정 자식클래스 안의 변수를 가져와야 할때는 if문과 instanceof를 사용해서 비교 후 맞으면 그 변수를 가져와야 한다.
			// BUT. 공통적으로 오버라이딩이 된 경우에는 굳이 필요가 없다. 그냥 가져오면 thats' ok
			//ex) e.toString ( 오버라이딩으로 모두 선언되어 있음 , 자동으로 해당하는 것 가져옴)
			System.out.println(e);
			
		}
		
				/*
				Electronic e = new Desktop();//Desktop은 전자상가에 있는 상품이다.
				Electronic e1 = new NoteBook();//NoteBook은 전자상가에 있는 상품이다.
				Electronic[0]=e;
				Electronic[1]=e1;
				
				
				전자상가는 Desktop 이 아니다. 
				e.getGraiphic() --> error 왜? getGraiphic()은 Desktop에 있다.
						
				그래서 instanceof 로 형변환이 가능한지 확인 
				e instanceof Desktop
				*/
				
				/* 다형성을 사용하는 이유 
				 * 1. 부모타입의 객체배열로 다양한 자식들을 받아 올수 있다. 
				 * --> 부모타입 하나로 다양한 자식을 다룰수 있다. 
				 * 
				 * 2. 매개변수에 다형성을 적용하는 경우 메소드갯수가 줄어든다. 
				 */
		
	}

}
