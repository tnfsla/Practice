package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException { 
	//CheckedException 은 반드시 예외처리를 해주어야한다.
	//조건문, 소스코드 수정 으로 해결이 불가하다. -- 예측이 불가능
	// 주로 외부 매개체의 입출력시 발생(IOException이 대표적)
	
	public void method1() { // 적어도 여기에서 throws하는것 잡아주는게 좋음 (try - catch) 통해서 잡음
		try {
			method5();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("종료!!");
		}
	}
	
	public void method2() throws IOException {
		//1. try~catch()처리 :
		// try:예외가 발생할 가능성이 있는 코드를 블록내에 작성
		// catch(발생될 예외 클래스 매개변수) : try 구문에서 예외가 발생하면 어떻게 처리할것인지 작성
		// finally : try~catch 수행 후 반드시 꼭 실행되어야하는 코드 작성
		byte[] a = {'a','b','c'};
//		try {
			System.out.write(a);
//		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
			
		//2. throws : 지금 이 메소드에서 예외처리를 하지 않고, 현재 이 메소드를 호출한곳으로 위임하겠다~	
	}
	
	public void method3() {
		BufferedReader br = null;
//		br = new BufferedReader(new FileReader("aa.txt"));  //없는 파일일 수도 있기때문에 무조건 예외처리해야함
		try {
			br = new BufferedReader(new FileReader("aa.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("파일이 없다구용");
		}finally {
			try {
				if(br!=null) { //입출력에서 nullPoint 처리 (실행시 FileNotFoundException인 경우에(파일이 없을때) 발생시키고,
//														catch에서 printStatckTrace(); 출력시키고, finally블럭에서 레퍼런스 변수 (br)에 초기값 null이
//														그대로 들어가있는 상태이기 때문에 null을 참조하는 레퍼런스 변수에 close()를 사용했기 때문에 
//														NullPointerException이 발생한다. 그래서 if문으로 처리함.
				br.close();
				}else {
					System.out.println("파일이 없어서 못닫는다구용");
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void method4() {
//		 try-with-resource : 반납할 close 자원이 있는 경우 처리-> try()괄호안에 객체를 생성할 수 있고, 이 괄호 안에서 생성한 객체는 close해주지 않아도 자동 close된다.
//		 												BufferedReader사용시 용이
		try(BufferedReader br = new BufferedReader(new FileReader(""));){
			
		}catch(FileNotFoundException e) { // IOexception보다 작은 exception
			e.printStackTrace();
		}catch (IOException e) { 		  // Filenotfound보다 큰 exception 		// IO catch는 method1() (상위클래스)로 보내도 상관이 없다.
			e.printStackTrace();
		}//br을 닫지 않아도 상관이 없다-!
	}
	
	public void method5() throws Exception {
		//InputStreamReader: 바이트 스트림을 문자 스트림으로 연결시켜주는 역할을 하는 보조스트림
				//system 클래스의 inputStream System.in --> byte단위 표준인풋스트림키보드입력
				//			   outputStream System.out --> 표준 아웃풋 스트림 화면출력  
				//BufferedReader는 문자 입력 스트림에 연결되어 버퍼를 제공해 주는 보조 스트림이다.
				//BufferedReader는 입력 소스로부터 자신의 내부 버퍼 크기만큼 데이터를 미리 읽고 버퍼에 저장해 둔다. 
				//프로그램은 외부의 입력 소스로부터 직접 읽는 대신 버퍼로부터 읽음으로써 읽기 성능이 향상된다
				//readLine(); 한줄씩 읽은 만큼 반환
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("아무 문자열을 입력하세요");
		
//		try {
//			String str = br.readLine();
//			System.out.println(str);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			try {
//				br.close(); //finally에 들어가야함~ 무조건 닫아야하기 때문에!
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		String str = br.readLine();
		System.out.println(str);
		
		if(str.equals("a")) {
			throw new Exception("에러 발생했습니다"); //에러 발생했다고 아예 정의해서 던져버리는 상황
		}

	}

}
