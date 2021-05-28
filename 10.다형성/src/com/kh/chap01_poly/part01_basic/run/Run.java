package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class Run {

	public static void main(String[] args) {
		// 지금까지 배운 것 : '=' 대입연산자의 양 옆자료형 (타입)은 같아야한다.
		
		// 1.부모타입 레퍼런스로 부모객체 다루는 경우
		System.out.println("1. 부모타입 레퍼런스로 부모객체 다루는 경우");
		Parent p = new Parent();
		p.printParent();
		//p 레퍼런스로 Parent 에 접근했음.
		
		// 2. 자식타입 레퍼런스(참조변수)로 자식 객체 다루는경우      ------------>업 캐스팅
		System.out.println("2. 자식타입 레퍼런스(참조변수)로 자식 객체 다루는경우");
		Child1 c1 = new Child1();
		c1.printChild1();
		c1.printParent();
		//((Parent)c1).printParent();  ((Parent)c1)<< 생략되어있음 자동 형변환임 c1을 Parent형으로!
		// c1레퍼런스로는  Parent와 Child1 둘다 접근이 가능하다.(Parent 접근시에는 '자동 형변환'을 해 준것이다.)
		
		
		//다형성
		// 3. 부모타입 레퍼런스로 자식 객체를 다루는 경우    -------------->다운캐스팅 (명시적 형변환 필요)
		Parent p1 = new Child1();
		p1.printParent();
//		p1.printChild1(); 				불가능함
		((Child1)p1).printChild1(); // 부모 레퍼런스인 p1에서 자식 클래스인 Child에 접근하려면 '명시적 강제 형변환' 을 해주어야 한다.

		
		//Child1 c2 = new Parent(); ------------> 문법 오류로 불가능 (자식 레퍼런스로 부모 객체를 다룰 수 없다(패륜)) // 자식 기능이 더 많아서!
		
		
		
		
		// 상속구조의 클래스들 간에는 형변환이 가능하다.
		
		// 1. UpCasting
		// 자식타입 ---> 부모타입으로 형변환
		// 생략이 가능하다 (자동 형변환)
		// 따라서 자식.부모메소드() 사용 가능했던 것
		
		// 2. DownCasting
		// 부모타입 ---> 자식타입으로 형변환
		// 생략이 불가능하다 (반드시 명시해줘야 한다)
		// ((자식)부모).자식메소드() 로 명시적 형변환 해야함
		
		// 3. 불가능한 경우 : 다형성의 정의는 부모타입으로 부터 파생된 여러가지 타입의 자식 객체를 부모 클래스 타입 하나로 다룰 수 있는 기술
		// Child1 c2 = new Parent(); // 컴파일에러 : 소스상의 문법 오류 (타입이 맞지않아 생기는 오류)
		// Child1 c2 = (Child1) new Parent(); // 명시적 다운 캐스팅 해주고 프로그램 실행  -->불가능
		// c2.printParent(); // 런타임에러 : 프로그램이 실행시 발생하는 오류
		
		
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1,2,4);
		arr1[1] = new Child1(2,3,5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(2,1,5);
		arr2[1] = new Child2(5,7,2);
		
		// 다형성이 적용된 경우
		Parent[] arr3 = new Parent[4];
		arr3[0] = new Child1(1,2,4);
		arr3[1] = new Child1(2,3,5);
		arr3[2] = new Child2(2,1,5);
		arr3[3] = new Child2(5,7,2);
		
		//하나의 부모타입으로 다양한 자식들을 생성
		//---> 자식들에게 접근할 때 하나의 부모타입으로 접근할 수 있다. (코드길이 감소, 유연한 코딩가능)
		
		//각각의 자식 메소드를 실행 -> 자식타입으로 형변환을 해서 자식 메소드를 실행
		//단, 이때 각 인덱스별로 실제 참조하고 있는 실제 자식 자료형으로 형변환을 해줘야함.
		((Child1)arr3[0]).printChild1();
		((Child1)arr3[1]).printChild1();
		((Child2)arr3[2]).printChild2();
		((Child2)arr3[3]).printChild2();
		
		System.out.println("반복문을 통한 출력");
		for(int i =0; i <arr3.length;i++) {
			//instanceof를 여기서 사용하는 것. child1 인지 child2인지 구분하기 위해서
			//현재 레퍼런스가 실제로 어떤 클래스의 주소를 참조하고 있는지 확인할 때 사용
			// 클래스타입이 일치하면 true , 아니면 false -->조건식 이용
			
			// 레퍼런스             		     클래스명(타입)
			if(arr3[i] instanceof Child1) { //해당 인덱스에 실제 Child1 타입을 참조하고 있다면 true, 아니면 false
				((Child1)arr3[i]).printChild1(); //Child1일경우 형변환 통해서 출력
			}else {
				((Child2)arr3[i]).printChild2();
			}
			arr3[i].print();  //오버라이드를 하면 굳이 위의 작업을 안해도 되긴한다.   --->동적 바인딩

			// 오버라이딩 개념을 접목하게 되면 자동으로 내가 실제 참고하고있는 클래스 메소드를 찾아가서 실행
			// 동적바인딩 : 프로그램이 실행 되기전에 컴파일이 되면서 모든 메소드는 정적바인딩이 된다.
			// 컴파일시에 정적 바인딩된 메소드를 실행할 당시의 객체 타입을 기준으로 바인딩 되는 것을 동적 바인딩이라고 하고
			// 상속 관계로 이루어져 (다형성 적용) 메소드 오버라이딩이 되어 있으면
			// 정적 바인딩 된 메소드 코드보다 오버라이딩 된 메소드를 우선적으로 실행한다.
			
		}
		
		System.out.println("==========");
		for(Parent pt : arr3) {
			//pt.print();
			if(pt instanceof Child1) {
				((Child1)pt).printChild1();
			}else {
				((Child2)pt).printChild2();
			}
		}
		
	}

}
