package com.kh.chap04_assist.part01_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {
	public void fileSave() {
		
		//1. 보조스트림 생성 전에 기반스트림부터 생성해야함 (어떤 외부 매체와 데이터를 주고받을것인지를 선택해주는 메인스트림 반드시 필요)
//		FileWriter fw = null; 아래처럼 바로 선언하면 생략 가능
		BufferedWriter bw = null;
		
		try {
			//2. 보조스트림 생성 (기반스트림을 좀 더 향상시키고자함.) 아래처럼 FileWriter를 바로 생성하여 넣는다면 따로 기반스트림을 선언할 필요는 없음.
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			bw.write("안녕하세요 \n");
			bw.write("반갑습니다.\n");
			bw.newLine(); // 새로운 라인을 추가함
			bw.write("감사합니다 \n ");
			
			//BufferedWriter의 장점 : 2byte 단위로 데이터가 출력될 때 버퍼라는 공간에 계속 쌓고 한번에 출력해줌, 
			//기반스트림에서는 제공해주지않는 newLine() (개행시켜줌)
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(bw!=null) bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		//try with resource 구문 --> try(스트림객체생성구문을 작성) : 다 사용하고나서 알아서 닫아준다 -> close() 
//		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))){
//			bw.write("안녕하세요 \n");
//			bw.write("반갑습니다.\n");
//			bw.newLine(); // 새로운 라인을 추가함
//			bw.write("감사합니다 \n ");
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
		
		
	}
	
	public void fileOpen() { // 끝나면 -1이 아닌 null이 반환된다.
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))) {
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
			
			String temp = null;
			while((temp = br.readLine())!=null) {
				System.out.println(temp);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
