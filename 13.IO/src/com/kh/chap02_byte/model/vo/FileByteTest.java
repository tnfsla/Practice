package com.kh.chap02_byte.model.vo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteTest {
	
	// 스트림의 특징
		// - 단방향 : 입력이면 입력/ 출력이면 출력만 가능! 입력과 출력을 동시다발적으로 하고자 한다면 하나의 스트림으로 안됨! 입렵스트립, 출력스트림 따로 열어야됨!!
		// - 선입선출 : 통로가 곧 파이프같은 개념이기 때문에 먼저 보낸 값이 먼저 나옴! 시간지연
		
		// 스르림의 구분
		// > 통로의 사이즈(1byte짜리 / 2byte짜리)
		//	- 바이트 스트림 : 1byte짜리 왔다 갔다 할 수 있을 정도의 사이즈! (좁은 통로)	=> 입력(InputStream) / 출력(OutputStream)
		//	- 문자 스트림 : 2byte짜리 왔다 갔다 할 수 있을 정도의 사이즈! (좀 더 넓은 통로)	=> 입력(Reader) / 출력(Writer)
		
		// > 외부 매체와 직접 연결하는 유무
		//	- 기반 스트림 : 외부매체와 직접적으로 연결하는 통로
		//	- 보조 스트림 : 말 그대로 보조역할만 하는 통로 (속도를 빠르게 한다거나, 그 외에 유용한 기능들을 제공 한다거나)
		//			     따라서 보조스트림 단도으로는 사용 불가! 반드시 외부 매체와 연결되어 있는 기반 스트림은 기본적으로 있어야됨!
		
	
	// 프로그램 --> 외부매체 (파일) (출력 : 프로그램 내의 데이터를 파일로 내보내기, 즉 파일로 저장)
	public void fileSave() {
		//FileOutputStream : "파일"로 데이터를 1바이트 단위로 출력하는 스트림
		FileOutputStream fout = null;
		//1. FileOutputStream 객체 생성시 연결통로가 만들어짐
		try {
			//true 미작성시 : 기존 해당 파일이 있을 경우 덮어씌워짐(기본 false)
			fout = new FileOutputStream("a_byte.txt");// 경로가 없을 시 FileNotFoundException 발생
			
			
			//true 작성 시 : 기존에 파일이 있는 경우 이어서 작성됨 append
//			fout = new FileOutputStream("a_byte.txt",true); 
			
			//2. 파일에 데이터를 출력하고자할때 write()메소드를 사용한다. // IOException 발생
			// 1byte 단위로 출력되기 때문에 (-128~127)까지의 숫자만 출력 가능. (단, 파일에는 해당 숫자의 고유한 문자가 기록됨)
			fout.write(97);
			fout.write('b');
			// 출력 값 : ab
			
			// fout.write('강'); 한글은 2byte 이기 때문에 깨져서 저장이 된다. --> 바이트 스트림으로는 제한적이다.
			byte[] bArr = {99,100,101,102,103};
			fout.write(bArr); // 배열형식으로 가능하다.
			fout.write(bArr,0,3); // bArr 배열에서 0부터 3개를 추가한다.
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) { //fout.write에서 발생할 수 있는 예외사항
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fout!=null) fout.close();  // fout이 null이 아니면 닫게끔
			} catch (IOException e) { // 닫는 과정에서도 IO 예외 발생할 수 있음
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
	}
	
	// 프로그램 <-- 파일( 파일 입력 : 파일로부터 데이터 받아오기)
	public void fileRead() {
		//FileInputStream : "파일"로 부터 데이터를 1Byte단위로 입력받는 스트림
		//1. FileInputStream 객체 생성 --> 생성시 연결 통로가 만들어짐
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a_byte.txt");
			//2. 파일로부터 데이터를 입력받고자 할때는 read() 메소드 사용 --> 1byte 단위로 읽어오게 되고, 파일의 끝을 만나면 -1값을 받아온다.
//			System.out.println(fis.read()); //IOException 발생 , try-catch 새로하지말고 catch 추가하기
			
			
			
			// fis.read()를 하나 호출 할때마다 1개씩 읽고 나감(list나 tokenizer 같은 느낌인듯)
			int value = 0; // EOF(파일의 끝)을 만나면 -1 이니까
			while((value = fis.read()) != -1) {  
				System.out.println(value);   //아스키코드값
				System.out.println((char)value);  // 기존은 byte 형, 형변환해서 문자형으로
			}
	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
