package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharTest {
	
	//프로그램-->파일(출력 : 프로그램내에서 파일 내보내기)
	public void fileSave() {
		//FileWriter : 파일로 데이터를 2Byte 단위로 출력하기(한글사용) <-> fileoutputstream,
		
		//1.FileWriter 객체 생성 --> 해당파일이 없으면 자동으로 만들어지고 연결 통로를 만들어준다. 해당 파일이 기존에 있으면 연결 통로만 연결해줌.
		FileWriter fw = null;
		try {
			fw = new FileWriter("b_char.txt"); //, true를 통해서 이어서 저장가능
			
			//2. write 메소드를 사용해서  출력하고자하는 데이터를 내보냄, 2byte단위이므로 문자열 전송 가능(문자로 하나씩 전송되는개념)
			fw.write("안녕하세요");
			fw.write('A');
			fw.write(' ');
			fw.write('\n');
			
			char[] cArr = {'a','p','p','l','e'};
			fw.write(cArr);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//3. 닫아주기는 꼭 기억하기
				if(fw != null) fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void fileOpen() {
//		FileReader : 파일로부터 데이터를 2byte단위로 입력받기
//		1. FileReader 객체 생성 --> 연결통로 만들기
		FileReader fr = null;
		try {
			fr = new FileReader("b_char.txt");
			
			int value = 0;
			while((value = fr.read()) != -1) {  // 끝은 -1 반환
				System.out.print((char)value); //int 타입이기때문에 char형으로 강제형변환
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
