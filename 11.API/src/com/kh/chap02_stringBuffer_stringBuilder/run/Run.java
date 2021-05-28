package com.kh.chap02_stringBuffer_stringBuilder.run;

public class Run {
	public static void main(String[] args) {
				// String 클래스의 원리
				// String a 값에 계속 값을 더해가는 경우 새로운 String 클래스가 만들어진다.
				
				// StringBuffer 나 StringBuilder의 원리
				
				// 새로운 객체를 생성시키지 않고, 기존에 있는 객체의 크기를 증가시키면서 값을 더한다.
				// * 응답시간
				// String > StringBuffer > StringBuilder
				// * 메모리 String은 주소를 바꿔가면서 만들지만 ,둘은 같은 주소에 크기만 증가시키면서 더해준다.
				// String > StringBuffer == StringBuilder
		
//		method1();
//		method2();
		method3();
				
	}

	private static void method3() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("난");
//		- append() : 값을 추가
		sb.append("배가 고프다").append("!!!"); //메소드를 이어서 호출할 수 있는 상황 --> 메소드체이닝
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
//		- insert : 삽입
		sb.insert(1, "저녁시간전이라~"); // 앞의 숫자는 index(위치)
		System.out.println(sb);
		
//		- delete : 삭제
		sb.delete(0, 9); //(0, 0)이면 삭제가 안됨. ==> 뒷자리는 포함을 시키지 않고 그전까지 삭제한다.
		System.out.println(sb); 
		
//		- reverse : 반전
		sb.reverse();
		System.out.println(sb);
	}

	private static void method2() {
		// TODO Auto-generated method stub
		String str = "반가워";
		System.out.println("str 기존  : "+str+" 주소 : "+System.identityHashCode(str));
		
		str+="난 스트링이라고해^.^";
		System.out.println("str 기존  : "+str+" 주소 : "+System.identityHashCode(str)); // 주소가 바뀜
		
		StringBuffer sbf = new StringBuffer("안녕~~");
		System.out.println("sbf 기존  : "+sbf+" 주소 : "+System.identityHashCode(sbf));
		
//		- .append() : 추가 해주기
		
		sbf.append("난 스트링 버퍼야 ^^^^");
		System.out.println("sbf 기존  : "+sbf+" 주소 : "+System.identityHashCode(sbf)); // 주소값 동일 기존에 있는 객체에 증가시키고 주소는 그대로, 크기만 늘어나게끔
		
		StringBuilder sbd = new StringBuilder("Wooow");
		System.out.println("sbd 기존  : "+sbd+" 주소 : "+System.identityHashCode(sbd));
		sbd.append("난 스트링 빌더라고해^^");
		System.out.println("sbd 기존  : "+sbd+" 주소 : "+System.identityHashCode(sbd)); // 주소값은 StringBuilder나 StringBuffer나 바뀌지 않는다 
																					// 기존 주소에서 크기만 확장해가며 만듬
	}

	private static void method1() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("환불원정대");
		StringBuilder sb1 = new StringBuilder(20); // 크기 지정이 가능하다, 기본 메모리 확보 크기를 정해서 객체를 생성할 수 있음.
				
//		- capacity() : 크기
		System.out.println(sb.capacity()); // sb의 크기 16(기본 크기)+5(문자열길이)
		System.out.println(sb1.capacity()); // 20으로 지정해서 20이 됨.
		
		
//		- length() : 문자열 길이
		System.out.println(sb.length());
		
		
	}

}
